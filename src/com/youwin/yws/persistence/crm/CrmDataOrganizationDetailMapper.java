package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmDataOrganizationDetail;
import com.youwin.yws.models.crm.CrmDataOrganizationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmDataOrganizationDetailMapper {
    int countByExample(CrmDataOrganizationDetailExample example);

    int deleteByExample(CrmDataOrganizationDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmDataOrganizationDetail record);

    int insertSelective(CrmDataOrganizationDetail record);

    List<CrmDataOrganizationDetail> selectByExample(CrmDataOrganizationDetailExample example);

    CrmDataOrganizationDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmDataOrganizationDetail record, @Param("example") CrmDataOrganizationDetailExample example);

    int updateByExample(@Param("record") CrmDataOrganizationDetail record, @Param("example") CrmDataOrganizationDetailExample example);

    int updateByPrimaryKeySelective(CrmDataOrganizationDetail record);

    int updateByPrimaryKey(CrmDataOrganizationDetail record);
}