/**
 * @author LYU
 * @create 2018-01-02-16:04
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.mapper;

import com.wtown.userauthentication.common.model.userauth.Sys_role_resource;
import org.apache.ibatis.annotations.*;

@Mapper
public interface SysRoleResourceMapper {
    @Select("SELECT rr.id FROM sys_role_resource rr WHERE rr.role_id = #{role_id} AND rr.resource_id = #{resource_id}")
    Sys_role_resource getRoleResource(@Param("role_id") Long role_id, @Param("resource_id") Long resource_id);

    @Insert("INSERT INTO sys_role_resource(\n" +
            "  role_id\n" +
            "  ,resource_id\n" +
            ") VALUES (\n" +
            "  #{role_id}   -- role_id - IN bigint(20)\n" +
            "  ,#{resource_id}   -- resource_id - IN bigint(20)\n" +
            ")")
    void insert(Sys_role_resource role_resource);

    @Delete("DELETE FROM sys_role_resource \n" +
            "WHERE id = #{id};")
    void delete(@Param("id") Long id);
}
