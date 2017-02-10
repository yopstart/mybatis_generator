package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.UserSessions;
import com.youwin.yws.models.crm.UserSessionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSessionsMapper {
    int countByExample(UserSessionsExample example);

    int deleteByExample(UserSessionsExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserSessions record);

    int insertSelective(UserSessions record);

    List<UserSessions> selectByExample(UserSessionsExample example);

    UserSessions selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserSessions record, @Param("example") UserSessionsExample example);

    int updateByExample(@Param("record") UserSessions record, @Param("example") UserSessionsExample example);

    int updateByPrimaryKeySelective(UserSessions record);

    int updateByPrimaryKey(UserSessions record);
}