/**
 * @author LYU
 * @create 2018年01月02日 16:00
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.impl;

import com.wtown.userauthentication.common.model.userauth.Sys_resource;
import com.wtown.userauthentication.userauth.dao.SysResourceDao;
import com.wtown.userauthentication.userauth.dao.mapper.SysResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SysResourceDaoImpl implements SysResourceDao {

    @Autowired
    private SysResourceMapper resourceMapper;

    @Override
    public Sys_resource getResourceByUrl(String uri) {
        return resourceMapper.getResourceByUrl(uri);
    }

    @Override
    public void insert(Sys_resource resource) {
        resourceMapper.insert(resource);
    }

    @Override
    public void update(Sys_resource resource) {
        resourceMapper.update(resource);
    }

}
