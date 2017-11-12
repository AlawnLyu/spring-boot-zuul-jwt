/**
 * @author LYU
 * @create 2017-11-10-10:11
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao;

import com.wtown.userauthentication.common.model.userauth.Sys_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_role;
import com.wtown.userauthentication.common.model.userauth.Sys_role_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_user;

public interface SysUserDao {
    Sys_user getUserByName(String uname);

    Long getRoleIdByUserId(Long id);

    Sys_role getRoleById(Long id);

    Sys_role getRoleByName(String rname);

    Sys_resource getResourceByUrl(String uri);

    Sys_role_resource getRoleResource(Long role_id, Long resource_id);
}
