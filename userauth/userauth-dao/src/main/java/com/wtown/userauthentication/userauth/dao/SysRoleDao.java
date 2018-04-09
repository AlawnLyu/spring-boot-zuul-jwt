/**
 * @author LYU
 * @create 2018-01-02-15:48
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao;

import com.wtown.userauthentication.common.model.userauth.Sys_role;

public interface SysRoleDao {
    Long getRoleIdByUserId(Long id);

    Sys_role getRoleById(Long id);

    Sys_role getRoleByName(String rname);

    void insert(Sys_role role);

    void update(Sys_role role);
}
