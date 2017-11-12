/**
 * @author LYU
 * @create 2017年11月09日 16:43
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.controller;

import com.wtown.userauthentication.common.base.BaseController;
import com.wtown.userauthentication.common.model.enums.MessageCodeEnum;
import com.wtown.userauthentication.common.model.userauth.AccessToken;
import com.wtown.userauthentication.common.model.userauth.LoginPara;
import com.wtown.userauthentication.common.model.userauth.Sys_user;
import com.wtown.userauthentication.common.util.JWTUtil;
import com.wtown.userauthentication.common.util.Md5Util;
import com.wtown.userauthentication.userauth.service.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/oauth")
public class OAuthController extends BaseController {

    @Autowired
    private OAuthService oAuthService;

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public String getAccessToken(@RequestBody LoginPara loginPara) throws IOException {
        String resultStr;

        //用户登陆
        Sys_user user = oAuthService.getUserByName(loginPara.getUser_name());
        if (user == null) {
            resultStr = returnErrorMessage(MessageCodeEnum.USER_EXIST);
        } else {
            String md5Pwd = Md5Util.getMD5(loginPara.getPwd() + user.getSalt());
            if (md5Pwd.compareTo(user.getPwd()) != 0) {
                resultStr = returnErrorMessage(MessageCodeEnum.USER_PASSWORD_WRONG);
            } else {
                String role = oAuthService.getRoleNameByUserId(user.getId());
                String token = JWTUtil.createJWT(user.getUser_name(), user.getId() + "", role, oAuthService.getIssuer(), oAuthService.getExpiration(), oAuthService.getSecret());

                AccessToken accessTokenEntity = new AccessToken();
                accessTokenEntity.setAccess_token(token);
                accessTokenEntity.setExpires_in(oAuthService.getExpiration());
                accessTokenEntity.setToken_type("bearer");

                resultStr = returnSuccessMessage(accessTokenEntity);
            }
        }
        return resultStr;
    }

    @RequestMapping(value = "/checkpermissions", method = RequestMethod.POST)
    public String checkPermissions(@RequestParam String role, @RequestParam String uri) throws IOException {
        String resultStr;
        resultStr = returnErrorMessage(MessageCodeEnum.DO_NOT_HAVE_PERMISSION);
        if (oAuthService.checkPermission(role, uri) == true) {
            resultStr = returnSuccessMessage("");
        }
        return resultStr;
    }

    @RequestMapping(value = "/shouldfilter", method = RequestMethod.POST)
    public String shouldFilter(@RequestParam String role, @RequestParam String uri) throws IOException {
        String resultStr;
        resultStr = returnErrorMessage(MessageCodeEnum.SUPER_PERMISSION);
        if (oAuthService.shouldFilter(role, uri) == true) {
            resultStr = returnSuccessMessage("");
        }
        return resultStr;
    }
}
