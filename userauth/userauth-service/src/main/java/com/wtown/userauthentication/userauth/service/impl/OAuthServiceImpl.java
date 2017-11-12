/**
 * @author LYU
 * @create 2017年11月10日 10:24
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.service.impl;

import com.wtown.userauthentication.common.model.userauth.Sys_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_role;
import com.wtown.userauthentication.common.model.userauth.Sys_role_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_user;
import com.wtown.userauthentication.userauth.dao.SysUserDao;
import com.wtown.userauthentication.userauth.service.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OAuthServiceImpl implements OAuthService {

    @Value("${jwt.token.secret}")
    private String secret;

    @Value("${jwt.token.expiration}")
    private Long expiration;

    @Value("${jwt.token.issuer}")
    private String issuer;

    @Autowired
    private SysUserDao userDao;

    @Override
    public String getSecret() {
        return secret;
    }

    @Override
    public Long getExpiration() {
        return expiration;
    }

    @Override
    public String getIssuer() {
        return issuer;
    }

    @Override
    public Sys_user getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public String getRoleNameByUserId(Long id) {
        Sys_role role = userDao.getRoleById(userDao.getRoleIdByUserId(id));
        return role.getName();
    }

    @Override
    public Boolean checkPermission(String role_name, String uri) {
        Sys_role role = userDao.getRoleByName(role_name);
        if (role == null) {
            return false;
        }
        Sys_resource resource = userDao.getResourceByUrl(uri);
        if (resource == null) {
            return false;
        }
        Sys_role_resource role_resource = userDao.getRoleResource(role.getId(), resource.getId());
        if (role_resource == null) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean shouldFilter(String role_name, String uri) {
        Sys_role role = userDao.getRoleByName(role_name);
        if (role == null) {
            return true;
        }
        if (!role.getCode().equals("superManager")){
            return true;
        }
        return false;
    }
}
