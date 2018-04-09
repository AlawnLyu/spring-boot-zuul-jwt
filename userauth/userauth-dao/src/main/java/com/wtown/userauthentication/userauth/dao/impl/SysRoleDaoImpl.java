/**
 * @author LYU
 * @create 2018年01月02日 15:49
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.impl;

import com.wtown.userauthentication.common.model.userauth.Sys_role;
import com.wtown.userauthentication.userauth.dao.SysRoleDao;
import com.wtown.userauthentication.userauth.dao.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SysRoleDaoImpl implements SysRoleDao {
    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public Long getRoleIdByUserId(Long id) {
        return roleMapper.getRoleByUserId(id);
    }

    @Override
    public Sys_role getRoleById(Long id) {
        return roleMapper.getRoleById(id);
    }

    @Override
    public Sys_role getRoleByName(String rname) {
        return roleMapper.getRoleByName(rname);
    }

    @Override
    public void insert(Sys_role role) {
        roleMapper.insert(role);
    }

    @Override
    public void update(Sys_role role) {
        roleMapper.update(role);
    }

}
