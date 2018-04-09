/**
 * @author LYU
 * @create 2018-01-02-15:59
 * @Copyright(C) 2010 - 2018 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.userauth.dao.mapper;

import com.wtown.userauthentication.common.model.userauth.Sys_resource;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SysResourceMapper {

    @Select("SELECT rs.id,rs.type,rs.`name`,rs.sort,rs.url FROM sys_resource rs WHERE rs.`status` = 1 AND rs.url = #{uri};")
    Sys_resource getResourceByUrl(String uri);

    @Insert("INSERT INTO sys_resource(\n" +
            "  type\n" +
            "  ,name\n" +
            "  ,permission\n" +
            "  ,icon\n" +
            "  ,sort\n" +
            "  ,url\n" +
            "  ,description\n" +
            "  ,status\n" +
            "  ,parent_id\n" +
            "  ,create_by\n" +
            "  ,create_at\n" +
            "  ,update_by\n" +
            "  ,update_at\n" +
            ") VALUES (\n" +
            "  #{type}  -- type - IN varchar(255)\n" +
            "  ,#{name} -- name - IN varchar(255)\n" +
            "  ,#{permission} -- permission - IN varchar(255)\n" +
            "  ,#{icon}  -- icon - IN varchar(255)\n" +
            "  ,#{sort}   -- sort - IN int(11)\n" +
            "  ,#{url}  -- url - IN varchar(255)\n" +
            "  ,#{description}  -- description - IN varchar(255)\n" +
            "  ,#{status} -- status - IN tinyint(1)\n" +
            "  ,#{parent_id} -- parent_id - IN bigint(20)\n" +
            "  ,#{create_by}   -- create_by - IN bigint(20)\n" +
            "  ,#{create_at} -- create_at - IN datetime\n" +
            "  ,#{update_by}   -- update_by - IN bigint(20)\n" +
            "  ,#{update_at}  -- update_at - IN datetime\n" +
            ")")
    void insert(Sys_resource resource);

    @Update("UPDATE sys_resource\n" +
            "SET\n" +
            "  type = #{type} -- varchar(255)\n" +
            "  ,name = #{name} -- varchar(255)\n" +
            "  ,permission = #{permission} -- varchar(255)\n" +
            "  ,icon = #{icon} -- varchar(255)\n" +
            "  ,sort = #{sort} -- int(11)\n" +
            "  ,url = #{url} -- varchar(255)\n" +
            "  ,description = #{description} -- varchar(255)\n" +
            "  ,status = #{status} -- tinyint(1)\n" +
            "  ,parent_id = #{parent_id} -- bigint(20)\n" +
            "  ,create_by = #{create_by} -- bigint(20)\n" +
            "  ,create_at = #{create_at} -- datetime\n" +
            "  ,update_by = #{update_by} -- bigint(20)\n" +
            "  ,update_at = #{update_at} -- datetime\n" +
            "WHERE id = #{id} -- bigint(20)")
    void update(Sys_resource resource);
}
