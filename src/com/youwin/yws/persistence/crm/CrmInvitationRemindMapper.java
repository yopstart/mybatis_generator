package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmInvitationRemind;
import com.youwin.yws.models.crm.CrmInvitationRemindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmInvitationRemindMapper {
    int countByExample(CrmInvitationRemindExample example);

    int deleteByExample(CrmInvitationRemindExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmInvitationRemind record);

    int insertSelective(CrmInvitationRemind record);

    List<CrmInvitationRemind> selectByExample(CrmInvitationRemindExample example);

    CrmInvitationRemind selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmInvitationRemind record, @Param("example") CrmInvitationRemindExample example);

    int updateByExample(@Param("record") CrmInvitationRemind record, @Param("example") CrmInvitationRemindExample example);

    int updateByPrimaryKeySelective(CrmInvitationRemind record);

    int updateByPrimaryKey(CrmInvitationRemind record);
}