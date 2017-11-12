/**
 * @author LYU
 * @create 2017-11-10-10:22
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.service;

import com.wtown.userauthentication.common.model.userauth.Sys_user;

public interface OAuthService {
    String getSecret();

    Long getExpiration();

    String getIssuer();

    Sys_user getUserByName(String name);

    String getRoleNameByUserId(Long id);

    Boolean checkPermission(String role_name, String uri);

    Boolean shouldFilter(String role_name, String uri);
}
