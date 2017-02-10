package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.RolePermissionsExample;
import com.youwin.yws.models.crm.RolePermissionsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionsMapper {
    int countByExample(RolePermissionsExample example);

    int deleteByExample(RolePermissionsExample example);

    int deleteByPrimaryKey(RolePermissionsKey key);

    int insert(RolePermissionsKey record);

    int insertSelective(RolePermissionsKey record);

    List<RolePermissionsKey> selectByExample(RolePermissionsExample example);

    int updateByExampleSelective(@Param("record") RolePermissionsKey record, @Param("example") RolePermissionsExample example);

    int updateByExample(@Param("record") RolePermissionsKey record, @Param("example") RolePermissionsExample example);
}