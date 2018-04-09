/**
 * @author LYU
 * @create 2018年01月03日 8:45
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.impl;

import com.wtown.userauthentication.common.model.userauth.Sys_user_role;
import com.wtown.userauthentication.userauth.dao.SysUserRoleDao;
import com.wtown.userauthentication.userauth.dao.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class SysUserRoleDaoImpl implements SysUserRoleDao {

    @Autowired
    private SysUserRoleMapper userRoleMapper;

    @Override
    public void insert(Sys_user_role userRole) {
        userRoleMapper.insert(userRole);
    }

    @Override
    public void delete(Long id) {
        userRoleMapper.delete(id);
    }
}
