package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.Organizations;
import com.youwin.yws.models.crm.OrganizationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationsMapper {
    int countByExample(OrganizationsExample example);

    int deleteByExample(OrganizationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Organizations record);

    int insertSelective(Organizations record);

    List<Organizations> selectByExample(OrganizationsExample example);

    Organizations selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Organizations record, @Param("example") OrganizationsExample example);

    int updateByExample(@Param("record") Organizations record, @Param("example") OrganizationsExample example);

    int updateByPrimaryKeySelective(Organizations record);

    int updateByPrimaryKey(Organizations record);
}