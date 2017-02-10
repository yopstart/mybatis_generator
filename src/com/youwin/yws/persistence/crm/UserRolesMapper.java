package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.UserRolesExample;
import com.youwin.yws.models.crm.UserRolesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolesMapper {
    int countByExample(UserRolesExample example);

    int deleteByExample(UserRolesExample example);

    int deleteByPrimaryKey(UserRolesKey key);

    int insert(UserRolesKey record);

    int insertSelective(UserRolesKey record);

    List<UserRolesKey> selectByExample(UserRolesExample example);

    int updateByExampleSelective(@Param("record") UserRolesKey record, @Param("example") UserRolesExample example);

    int updateByExample(@Param("record") UserRolesKey record, @Param("example") UserRolesExample example);
}