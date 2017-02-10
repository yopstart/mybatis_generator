package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmDataStudentDetail;
import com.youwin.yws.models.crm.CrmDataStudentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmDataStudentDetailMapper {
    int countByExample(CrmDataStudentDetailExample example);

    int deleteByExample(CrmDataStudentDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmDataStudentDetail record);

    int insertSelective(CrmDataStudentDetail record);

    List<CrmDataStudentDetail> selectByExample(CrmDataStudentDetailExample example);

    CrmDataStudentDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmDataStudentDetail record, @Param("example") CrmDataStudentDetailExample example);

    int updateByExample(@Param("record") CrmDataStudentDetail record, @Param("example") CrmDataStudentDetailExample example);

    int updateByPrimaryKeySelective(CrmDataStudentDetail record);

    int updateByPrimaryKey(CrmDataStudentDetail record);
}