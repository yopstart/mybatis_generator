package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.TeachingCourseType;
import com.youwin.yws.models.crm.TeachingCourseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachingCourseTypeMapper {
    int countByExample(TeachingCourseTypeExample example);

    int deleteByExample(TeachingCourseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeachingCourseType record);

    int insertSelective(TeachingCourseType record);

    List<TeachingCourseType> selectByExample(TeachingCourseTypeExample example);

    TeachingCourseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeachingCourseType record, @Param("example") TeachingCourseTypeExample example);

    int updateByExample(@Param("record") TeachingCourseType record, @Param("example") TeachingCourseTypeExample example);

    int updateByPrimaryKeySelective(TeachingCourseType record);

    int updateByPrimaryKey(TeachingCourseType record);
}