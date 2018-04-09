/**
 * @author LYU
 * @create 2018年01月02日 16:06
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.impl;

import com.wtown.userauthentication.common.model.userauth.Sys_role_resource;
import com.wtown.userauthentication.userauth.dao.SysRoleResourceDao;
import com.wtown.userauthentication.userauth.dao.mapper.SysRoleResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SysRoleResourceDaoImpl implements SysRoleResourceDao {

    @Autowired
    private SysRoleResourceMapper roleResourceMapper;

    @Override
    public Sys_role_resource getRoleResource(Long role_id, Long resource_id) {
        return roleResourceMapper.getRoleResource(role_id, resource_id);
    }

    @Override
    public void insert(Sys_role_resource roleResource) {
        roleResourceMapper.insert(roleResource);
    }

    @Override
    public void delete(Long id) {
        roleResourceMapper.delete(id);
    }
}
