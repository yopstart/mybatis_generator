package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmLeadsOrganizationAllot;
import com.youwin.yws.models.crm.CrmLeadsOrganizationAllotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmLeadsOrganizationAllotMapper {
    int countByExample(CrmLeadsOrganizationAllotExample example);

    int deleteByExample(CrmLeadsOrganizationAllotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmLeadsOrganizationAllot record);

    int insertSelective(CrmLeadsOrganizationAllot record);

    List<CrmLeadsOrganizationAllot> selectByExample(CrmLeadsOrganizationAllotExample example);

    CrmLeadsOrganizationAllot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmLeadsOrganizationAllot record, @Param("example") CrmLeadsOrganizationAllotExample example);

    int updateByExample(@Param("record") CrmLeadsOrganizationAllot record, @Param("example") CrmLeadsOrganizationAllotExample example);

    int updateByPrimaryKeySelective(CrmLeadsOrganizationAllot record);

    int updateByPrimaryKey(CrmLeadsOrganizationAllot record);
}