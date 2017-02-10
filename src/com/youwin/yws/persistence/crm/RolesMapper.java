package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.Roles;
import com.youwin.yws.models.crm.RolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolesMapper {
    int countByExample(RolesExample example);

    int deleteByExample(RolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByExample(RolesExample example);

    Roles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}