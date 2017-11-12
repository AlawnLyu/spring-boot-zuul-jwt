/**
 * @author LYU
 * @create 2017-11-10-10:14
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.mapper;

import com.wtown.userauthentication.common.model.userauth.Sys_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_role;
import com.wtown.userauthentication.common.model.userauth.Sys_role_resource;
import com.wtown.userauthentication.common.model.userauth.Sys_user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysUserMapper {
    @Select("SELECT u.id,u.user_name,u.`status`,u.pwd,u.salt FROM sys_user u WHERE u.`status` = 1 and u.user_name = #{user_name}; ")
    Sys_user getSingleUserByName(String user_name);

    @Select("SELECT ur.role_id FROM sys_user_role ur WHERE ur.user_id = #{id};")
    Long getRoleByUserId(Long id);

    @Select("SELECT r.id,r.`name`,r.`code`,r.`status` FROM sys_role r WHERE r.`status` = 1 and r.id = #{id}")
    Sys_role getRoleById(Long id);

    @Select("SELECT r.id,r.`name`,r.`code`,r.`status` FROM sys_role r WHERE r.`status` = 1 and r.name = #{name}")
    Sys_role getRoleByName(String name);

    @Select("SELECT rs.id,rs.type,rs.`name`,rs.sort,rs.url FROM sys_resource rs WHERE rs.`status` = 1 AND rs.url = #{uri};")
    Sys_resource getResourceByUrl(String uri);

    @Select("SELECT rr.id FROM sys_role_resource rr WHERE rr.role_id = #{role_id} AND rr.resource_id = #{resource_id}")
    Sys_role_resource getRoleResource(@Param("role_id") Long role_id,@Param("resource_id") Long resource_id);
}
