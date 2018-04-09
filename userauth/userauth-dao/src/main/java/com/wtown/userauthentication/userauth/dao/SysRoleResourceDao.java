/**
 * @author LYU
 * @create 2018-01-02-16:06
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao;

import com.wtown.userauthentication.common.model.userauth.Sys_role_resource;

public interface SysRoleResourceDao {

    Sys_role_resource getRoleResource(Long role_id, Long resource_id);

    void insert(Sys_role_resource roleResource);

    void delete(Long id);
}
