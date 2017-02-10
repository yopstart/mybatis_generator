package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmCustomerGroup;
import com.youwin.yws.models.crm.CrmCustomerGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmCustomerGroupMapper {
    int countByExample(CrmCustomerGroupExample example);

    int deleteByExample(CrmCustomerGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmCustomerGroup record);

    int insertSelective(CrmCustomerGroup record);

    List<CrmCustomerGroup> selectByExample(CrmCustomerGroupExample example);

    CrmCustomerGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmCustomerGroup record, @Param("example") CrmCustomerGroupExample example);

    int updateByExample(@Param("record") CrmCustomerGroup record, @Param("example") CrmCustomerGroupExample example);

    int updateByPrimaryKeySelective(CrmCustomerGroup record);

    int updateByPrimaryKey(CrmCustomerGroup record);
}