package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderStudentCourse;
import com.youwin.yws.models.crm.CrmOrderStudentCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderStudentCourseMapper {
    int countByExample(CrmOrderStudentCourseExample example);

    int deleteByExample(CrmOrderStudentCourseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderStudentCourse record);

    int insertSelective(CrmOrderStudentCourse record);

    List<CrmOrderStudentCourse> selectByExample(CrmOrderStudentCourseExample example);

    CrmOrderStudentCourse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderStudentCourse record, @Param("example") CrmOrderStudentCourseExample example);

    int updateByExample(@Param("record") CrmOrderStudentCourse record, @Param("example") CrmOrderStudentCourseExample example);

    int updateByPrimaryKeySelective(CrmOrderStudentCourse record);

    int updateByPrimaryKey(CrmOrderStudentCourse record);
}