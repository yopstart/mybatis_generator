package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderOrganization;
import com.youwin.yws.models.crm.CrmOrderOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderOrganizationMapper {
    int countByExample(CrmOrderOrganizationExample example);

    int deleteByExample(CrmOrderOrganizationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderOrganization record);

    int insertSelective(CrmOrderOrganization record);

    List<CrmOrderOrganization> selectByExample(CrmOrderOrganizationExample example);

    CrmOrderOrganization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderOrganization record, @Param("example") CrmOrderOrganizationExample example);

    int updateByExample(@Param("record") CrmOrderOrganization record, @Param("example") CrmOrderOrganizationExample example);

    int updateByPrimaryKeySelective(CrmOrderOrganization record);

    int updateByPrimaryKey(CrmOrderOrganization record);
}