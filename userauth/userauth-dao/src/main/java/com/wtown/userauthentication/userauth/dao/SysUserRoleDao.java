/**
 * @author LYU
 * @create 2018-01-03-8:44
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao;

import com.wtown.userauthentication.common.model.userauth.Sys_user_role;

public interface SysUserRoleDao {

    void insert(Sys_user_role userRole);

    void delete(Long id);
}
