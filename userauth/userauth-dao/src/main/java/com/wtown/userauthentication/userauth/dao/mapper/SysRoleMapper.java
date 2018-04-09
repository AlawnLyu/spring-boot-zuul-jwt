/**
 * @author LYU
 * @create 2018-01-02-13:11
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.mapper;

import com.wtown.userauthentication.common.model.userauth.Sys_role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SysRoleMapper {

    @Select("SELECT ur.role_id FROM sys_user_role ur WHERE ur.user_id = #{id};")
    Long getRoleByUserId(Long id);

    @Select("SELECT r.id,r.`name`,r.`code`,r.`status` FROM sys_role r WHERE r.`status` = 1 and r.id = #{id}")
    Sys_role getRoleById(Long id);

    @Select("SELECT r.id,r.`name`,r.`code`,r.`status` FROM sys_role r WHERE r.`status` = 1 and r.name = #{name}")
    Sys_role getRoleByName(String name);

    @Insert("INSERT INTO sys_role(\n" +
            "  name\n" +
            "  ,code\n" +
            "  ,remark\n" +
            "  ,status\n" +
            "  ,parent_id\n" +
            "  ,create_by\n" +
            "  ,create_at\n" +
            "  ,update_by\n" +
            "  ,update_at\n" +
            ") VALUES (\n" +
            "  #{name} -- name - IN varchar(255)\n" +
            "  ,#{code} -- code - IN varchar(255)\n" +
            "  ,#{remark}  -- remark - IN varchar(255)\n" +
            "  ,#{status} -- status - IN tinyint(1)\n" +
            "  ,#{parent_id}   -- parent_id - IN bigint(20)\n" +
            "  ,#{create_by}   -- create_by - IN bigint(20)\n" +
            "  ,#{create_at} -- create_at - IN datetime\n" +
            "  ,#{update_by}   -- update_by - IN bigint(20)\n" +
            "  ,#{update_at}  -- update_at - IN datetime\n" +
            ")")
    void insert(Sys_role role);

    @Update("UPDATE sys_role\n" +
            "SET\n" +
            "  name = #{name} -- varchar(255)\n" +
            "  ,code = #{code} -- varchar(255)\n" +
            "  ,remark = #{remark} -- varchar(255)\n" +
            "  ,status = #{status} -- tinyint(1)\n" +
            "  ,parent_id = #{parent_id} -- bigint(20)\n" +
            "  ,create_by = #{create_by} -- bigint(20)\n" +
            "  ,create_at = #{create_at} -- datetime\n" +
            "  ,update_by = #{update_by} -- bigint(20)\n" +
            "  ,update_at = #{update_at} -- datetime\n" +
            "WHERE id = #{id} -- bigint(20)")
    void update(Sys_role role);
}
