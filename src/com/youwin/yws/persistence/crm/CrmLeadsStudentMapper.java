package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmLeadsStudent;
import com.youwin.yws.models.crm.CrmLeadsStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmLeadsStudentMapper {
    int countByExample(CrmLeadsStudentExample example);

    int deleteByExample(CrmLeadsStudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmLeadsStudent record);

    int insertSelective(CrmLeadsStudent record);

    List<CrmLeadsStudent> selectByExample(CrmLeadsStudentExample example);

    CrmLeadsStudent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmLeadsStudent record, @Param("example") CrmLeadsStudentExample example);

    int updateByExample(@Param("record") CrmLeadsStudent record, @Param("example") CrmLeadsStudentExample example);

    int updateByPrimaryKeySelective(CrmLeadsStudent record);

    int updateByPrimaryKey(CrmLeadsStudent record);
}