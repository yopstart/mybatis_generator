package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmLeadsOrganization;
import com.youwin.yws.models.crm.CrmLeadsOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmLeadsOrganizationMapper {
    int countByExample(CrmLeadsOrganizationExample example);

    int deleteByExample(CrmLeadsOrganizationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmLeadsOrganization record);

    int insertSelective(CrmLeadsOrganization record);

    List<CrmLeadsOrganization> selectByExample(CrmLeadsOrganizationExample example);

    CrmLeadsOrganization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmLeadsOrganization record, @Param("example") CrmLeadsOrganizationExample example);

    int updateByExample(@Param("record") CrmLeadsOrganization record, @Param("example") CrmLeadsOrganizationExample example);

    int updateByPrimaryKeySelective(CrmLeadsOrganization record);

    int updateByPrimaryKey(CrmLeadsOrganization record);
}