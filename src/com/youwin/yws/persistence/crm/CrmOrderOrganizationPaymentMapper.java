package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderOrganizationPayment;
import com.youwin.yws.models.crm.CrmOrderOrganizationPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderOrganizationPaymentMapper {
    int countByExample(CrmOrderOrganizationPaymentExample example);

    int deleteByExample(CrmOrderOrganizationPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderOrganizationPayment record);

    int insertSelective(CrmOrderOrganizationPayment record);

    List<CrmOrderOrganizationPayment> selectByExample(CrmOrderOrganizationPaymentExample example);

    CrmOrderOrganizationPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderOrganizationPayment record, @Param("example") CrmOrderOrganizationPaymentExample example);

    int updateByExample(@Param("record") CrmOrderOrganizationPayment record, @Param("example") CrmOrderOrganizationPaymentExample example);

    int updateByPrimaryKeySelective(CrmOrderOrganizationPayment record);

    int updateByPrimaryKey(CrmOrderOrganizationPayment record);
}