/**
 * @author LYU
 * @create 2017年11月10日 10:13
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.impl;

import com.wtown.userauthentication.common.model.userauth.Sys_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_role_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_user;
import com.wtown.userauthentication.userauth.dao.SysUserDao;
import com.wtown.userauthentication.userauth.dao.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SysUserDaoImpl implements SysUserDao {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public Sys_user getUserByName(String uname) {
        return userMapper.getSingleUserByName(uname);
    }

    @Override
    public void insert(Sys_user user) {
        userMapper.insert(user);
    }

    @Override
    public void update(Sys_user user) {
        userMapper.update(user);
    }

}
