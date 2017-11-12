/**
 * @author LYU
 * @create 2017年11月10日 15:13
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.apigate.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.http.HttpServletRequestWrapper;
import com.netflix.zuul.http.ServletInputStreamWrapper;
import com.wtown.userauthentication.apigate.service.ApiGateService;
import com.wtown.userauthentication.common.converter.json.JsonDataUtil;
import com.wtown.userauthentication.common.model.dto.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class CustomFilter extends ZuulFilter {

    @Autowired
    private JsonDataUtil jsonDataUtil;

    @Autowired
    private ApiGateService gateService;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        try {
            RequestContext requestContext = getCurrentContext();
            String authorizationHeader = requestContext.getRequest().getHeader(HttpHeaders.AUTHORIZATION);
            String token = authorizationHeader.substring("Bearer".length()).trim();
            if (token.isEmpty() || token.equals("")) {
                return true;
            }
            System.out.println(token);
            System.out.println(requestContext.getRequest().getRequestURI());
            System.out.println(requestContext.getRequest().getServletPath());
            System.out.println(requestContext.getRequest().getRequestURL().toString());

            return gateService.shouldFilter(token, getUri(requestContext.getRequest().getRequestURI()));
        } catch (Exception e) {
            //e.printStackTrace();
            return true;
        }
    }

    @Override
    public Object run() {
        RequestContext ctx = getCurrentContext();
        try {
            String authorizationHeader = ctx.getRequest().getHeader(HttpHeaders.AUTHORIZATION);
            String token = authorizationHeader.substring("Bearer".length()).trim();
            ResultDTO resultDTO = gateService.checkPermission(token, getUri(ctx.getRequest().getRequestURI()));
            if (!resultDTO.getCode().equals("1000")) {
                // 过滤该请求，不对其进行路由
                ctx.setSendZuulResponse(false);
                // 返回错误码
                ctx.setResponseStatusCode(401);
                ctx.getResponse().setHeader("Content-type", "application/json;charset=UTF-8");
                // 返回错误内容
                ctx.setResponseBody(jsonDataUtil.writeObject(resultDTO));
                return null;
            }
            InputStream in = (InputStream) ctx.get("requestEntity");
            if (in == null) {
                in = ctx.getRequest().getInputStream();
            }
            String body = StreamUtils.copyToString(in, Charset.forName("UTF-8"));
            //body = "request body modified via request wrapper: "+ body;
            final byte[] bytes = body.getBytes("UTF-8");
            ctx.setRequest(new HttpServletRequestWrapper(getCurrentContext().getRequest()) {
                @Override
                public ServletInputStream getInputStream() throws IOException {
                    return new ServletInputStreamWrapper(bytes);
                }

                @Override
                public int getContentLength() {
                    return bytes.length;
                }

                @Override
                public long getContentLengthLong() {
                    return bytes.length;
                }
            });
        } catch (Exception e) {
            // 过滤该请求，不对其进行路由
            ctx.setSendZuulResponse(false);
            // 返回错误码
            ctx.setResponseStatusCode(401);
            // 返回错误内容
            ctx.getResponse().setHeader("Content-type", "application/json;charset=UTF-8");
            ctx.setResponseBody("{'code':'5000','message':'未知错误'}");
        }
        return null;
    }

    private RequestContext getCurrentContext() {
        return RequestContext.getCurrentContext();
    }

    private String getUri(String requestUri) {
        return requestUri.substring("/api".length());
    }
}
