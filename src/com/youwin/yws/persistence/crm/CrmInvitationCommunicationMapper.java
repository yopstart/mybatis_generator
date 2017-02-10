package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmInvitationCommunication;
import com.youwin.yws.models.crm.CrmInvitationCommunicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmInvitationCommunicationMapper {
    int countByExample(CrmInvitationCommunicationExample example);

    int deleteByExample(CrmInvitationCommunicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmInvitationCommunication record);

    int insertSelective(CrmInvitationCommunication record);

    List<CrmInvitationCommunication> selectByExample(CrmInvitationCommunicationExample example);

    CrmInvitationCommunication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmInvitationCommunication record, @Param("example") CrmInvitationCommunicationExample example);

    int updateByExample(@Param("record") CrmInvitationCommunication record, @Param("example") CrmInvitationCommunicationExample example);

    int updateByPrimaryKeySelective(CrmInvitationCommunication record);

    int updateByPrimaryKey(CrmInvitationCommunication record);
}