package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.TeachingSubject;
import com.youwin.yws.models.crm.TeachingSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachingSubjectMapper {
    int countByExample(TeachingSubjectExample example);

    int deleteByExample(TeachingSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeachingSubject record);

    int insertSelective(TeachingSubject record);

    List<TeachingSubject> selectByExample(TeachingSubjectExample example);

    TeachingSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeachingSubject record, @Param("example") TeachingSubjectExample example);

    int updateByExample(@Param("record") TeachingSubject record, @Param("example") TeachingSubjectExample example);

    int updateByPrimaryKeySelective(TeachingSubject record);

    int updateByPrimaryKey(TeachingSubject record);
}