package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderStudent;
import com.youwin.yws.models.crm.CrmOrderStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderStudentMapper {
    int countByExample(CrmOrderStudentExample example);

    int deleteByExample(CrmOrderStudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderStudent record);

    int insertSelective(CrmOrderStudent record);

    List<CrmOrderStudent> selectByExample(CrmOrderStudentExample example);

    CrmOrderStudent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderStudent record, @Param("example") CrmOrderStudentExample example);

    int updateByExample(@Param("record") CrmOrderStudent record, @Param("example") CrmOrderStudentExample example);

    int updateByPrimaryKeySelective(CrmOrderStudent record);

    int updateByPrimaryKey(CrmOrderStudent record);
}