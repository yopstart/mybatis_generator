package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmInvitationDetail;
import com.youwin.yws.models.crm.CrmInvitationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmInvitationDetailMapper {
    int countByExample(CrmInvitationDetailExample example);

    int deleteByExample(CrmInvitationDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmInvitationDetail record);

    int insertSelective(CrmInvitationDetail record);

    List<CrmInvitationDetail> selectByExample(CrmInvitationDetailExample example);

    CrmInvitationDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmInvitationDetail record, @Param("example") CrmInvitationDetailExample example);

    int updateByExample(@Param("record") CrmInvitationDetail record, @Param("example") CrmInvitationDetailExample example);

    int updateByPrimaryKeySelective(CrmInvitationDetail record);

    int updateByPrimaryKey(CrmInvitationDetail record);
}