/**
 * @author LYU
 * @create 2018-01-02-15:59
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao;

import com.wtown.userauthentication.common.model.userauth.Sys_resource;

public interface SysResourceDao {

    Sys_resource getResourceByUrl(String uri);

    void insert(Sys_resource resource);

    void update(Sys_resource resource);
}
