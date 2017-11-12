/**
 * @author LYU
 * @create 2017年11月11日 12:40
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.apigate.service.impl;

import com.wtown.userauthentication.apigate.feign.UserAuthRemoteService;
import com.wtown.userauthentication.apigate.service.ApiGateService;
import com.wtown.userauthentication.common.model.dto.ResultDTO;
import com.wtown.userauthentication.common.util.JWTUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApiGateServiceImpl implements ApiGateService {

    @Autowired
    private UserAuthRemoteService authRemoteService;

    @Value("${jwt.token.secret}")
    private String secret;

    @Override
    public String getSecret() {
        return secret;
    }

    @Override
    public Boolean shouldFilter(String token, String uri) {
        String role = getRoleFromToken(token);
        if (role.equals("")){
            return true;
        }
        ResultDTO resultDTO = authRemoteService.shouldFilter(role,uri);
        if (resultDTO.getCode().equals("1000")){
            return true;
        }
        return false;
    }

    @Override
    public ResultDTO checkPermission(String token, String uri) {
        String role = getRoleFromToken(token);
        ResultDTO resultDTO = new ResultDTO();
        if (role.equals("")){
            resultDTO.setCode("5001");
            resultDTO.setMessage("accesstoken failed");
            return resultDTO;
        }
        resultDTO = authRemoteService.checkPermission(role, uri);
        return resultDTO;
    }

    private String getRoleFromToken(String token) {
        try {
            Claims claims = JWTUtil.parseJWT(token, getSecret());
            return claims.get("role").toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
