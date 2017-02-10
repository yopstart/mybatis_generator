package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderStudentCourseDonate;
import com.youwin.yws.models.crm.CrmOrderStudentCourseDonateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderStudentCourseDonateMapper {
    int countByExample(CrmOrderStudentCourseDonateExample example);

    int deleteByExample(CrmOrderStudentCourseDonateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderStudentCourseDonate record);

    int insertSelective(CrmOrderStudentCourseDonate record);

    List<CrmOrderStudentCourseDonate> selectByExample(CrmOrderStudentCourseDonateExample example);

    CrmOrderStudentCourseDonate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderStudentCourseDonate record, @Param("example") CrmOrderStudentCourseDonateExample example);

    int updateByExample(@Param("record") CrmOrderStudentCourseDonate record, @Param("example") CrmOrderStudentCourseDonateExample example);

    int updateByPrimaryKeySelective(CrmOrderStudentCourseDonate record);

    int updateByPrimaryKey(CrmOrderStudentCourseDonate record);
}