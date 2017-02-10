package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.TeachingGrade;
import com.youwin.yws.models.crm.TeachingGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachingGradeMapper {
    int countByExample(TeachingGradeExample example);

    int deleteByExample(TeachingGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeachingGrade record);

    int insertSelective(TeachingGrade record);

    List<TeachingGrade> selectByExample(TeachingGradeExample example);

    TeachingGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeachingGrade record, @Param("example") TeachingGradeExample example);

    int updateByExample(@Param("record") TeachingGrade record, @Param("example") TeachingGradeExample example);

    int updateByPrimaryKeySelective(TeachingGrade record);

    int updateByPrimaryKey(TeachingGrade record);
}