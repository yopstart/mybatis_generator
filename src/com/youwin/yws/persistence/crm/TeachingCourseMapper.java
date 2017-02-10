package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.TeachingCourse;
import com.youwin.yws.models.crm.TeachingCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachingCourseMapper {
    int countByExample(TeachingCourseExample example);

    int deleteByExample(TeachingCourseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeachingCourse record);

    int insertSelective(TeachingCourse record);

    List<TeachingCourse> selectByExample(TeachingCourseExample example);

    TeachingCourse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeachingCourse record, @Param("example") TeachingCourseExample example);

    int updateByExample(@Param("record") TeachingCourse record, @Param("example") TeachingCourseExample example);

    int updateByPrimaryKeySelective(TeachingCourse record);

    int updateByPrimaryKey(TeachingCourse record);
}