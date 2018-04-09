/**
 * @author LYU
 * @create 2018-01-03-8:33
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.mapper;

import com.wtown.userauthentication.common.model.userauth.Sys_user_role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserRoleMapper {

    @Insert("INSERT INTO sys_user_role(\n" +
            "  user_id\n" +
            "  ,role_id\n" +
            ") VALUES (\n" +
            "  #{user_id} -- user_id - IN bigint(20)\n" +
            "  ,#{role_id} -- role_id - IN bigint(20)\n" +
            ")")
    void insert(Sys_user_role userRole);

    @Delete("DELETE FROM sys_user_role \n" +
            "WHERE id = #{id}")
    void delete(@Param("id") Long id);
}
