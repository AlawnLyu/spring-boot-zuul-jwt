/**
 * @author LYU
 * @create 2017-11-10-10:14
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.mapper;

import com.wtown.userauthentication.common.model.userauth.Sys_user;
import org.apache.ibatis.annotations.*;

@Mapper
public interface SysUserMapper {
    @Select("SELECT u.id,u.user_name,u.`status`,u.pwd,u.salt FROM sys_user u WHERE u.`status` = 1 and u.user_name = #{user_name}; ")
    Sys_user getSingleUserByName(String user_name);

    @Insert("INSERT INTO sys_user(\n" +
            "  mobile_phone\n" +
            "  ,user_name\n" +
            "  ,nickname\n" +
            "  ,pwd\n" +
            "  ,salt\n" +
            "  ,signature\n" +
            "  ,gender\n" +
            "  ,qq\n" +
            "  ,email\n" +
            "  ,avatar\n" +
            "  ,province\n" +
            "  ,city\n" +
            "  ,reg_ip\n" +
            "  ,score\n" +
            "  ,status\n" +
            "  ,create_by\n" +
            "  ,create_at\n" +
            "  ,update_by\n" +
            "  ,update_at\n" +
            ") VALUES (\n" +
            "  #{mobile_phone} -- mobile_phone - IN varchar(255)\n" +
            "  ,#{user_name}  -- user_name - IN varchar(50)\n" +
            "  ,#{nickname}  -- nickname - IN varchar(255)\n" +
            "  ,#{pwd} -- pwd - IN varchar(255)\n" +
            "  ,#{salt}  -- salt - IN varchar(255)\n" +
            "  ,#{signature}  -- signature - IN varchar(255)\n" +
            "  ,#{gender}   -- gender - IN tinyint(1)\n" +
            "  ,#{qq}   -- qq - IN bigint(20)\n" +
            "  ,#{email}  -- email - IN varchar(255)\n" +
            "  ,#{avatar}  -- avatar - IN varchar(500)\n" +
            "  ,#{province}  -- province - IN varchar(50)\n" +
            "  ,#{city}  -- city - IN varchar(50)\n" +
            "  ,#{reg_ip}  -- reg_ip - IN varchar(50)\n" +
            "  ,#{score}   -- score - IN int(10)\n" +
            "  ,#{status}   -- status - IN int(10)\n" +
            "  ,#{create_by}   -- create_by - IN bigint(20)\n" +
            "  ,#{create_at}  -- create_at - IN datetime\n" +
            "  ,#{update_by}   -- update_by - IN bigint(20)\n" +
            "  ,#{update_at}  -- update_at - IN datetime\n" +
            ")")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = java.lang.Long.class)
    Long insert(Sys_user user);

    @Update("UPDATE sys_user\n" +
            "SET\n" +
            "  mobile_phone = #{mobile_phone} -- varchar(255)\n" +
            "  ,user_name = #{user_name} -- varchar(50)\n" +
            "  ,nickname = #{nickname} -- varchar(255)\n" +
            "  ,pwd = #{pwd} -- varchar(255)\n" +
            "  ,salt = #{salt} -- varchar(255)\n" +
            "  ,signature = #{signature} -- varchar(255)\n" +
            "  ,gender = #{gender} -- tinyint(1)\n" +
            "  ,qq = #{qq} -- bigint(20)\n" +
            "  ,email = #{email} -- varchar(255)\n" +
            "  ,avatar = #{avatar} -- varchar(500)\n" +
            "  ,province = #{province} -- varchar(50)\n" +
            "  ,city = #{city} -- varchar(50)\n" +
            "  ,reg_ip = #{reg_ip} -- varchar(50)\n" +
            "  ,score = #{score} -- int(10)\n" +
            "  ,status = #{status} -- int(10)\n" +
            "  ,create_by = #{create_by} -- bigint(20)\n" +
            "  ,create_at = #{create_at} -- datetime\n" +
            "  ,update_by = #{update_by} -- bigint(20)\n" +
            "  ,update_at = #{update_at} -- datetime\n" +
            "WHERE id = #{id} -- bigint(20)")
    void update(Sys_user user);
}
