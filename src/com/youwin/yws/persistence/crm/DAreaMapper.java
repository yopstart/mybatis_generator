package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.DArea;
import com.youwin.yws.models.crm.DAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DAreaMapper {
    int countByExample(DAreaExample example);

    int deleteByExample(DAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DArea record);

    int insertSelective(DArea record);

    List<DArea> selectByExample(DAreaExample example);

    DArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DArea record, @Param("example") DAreaExample example);

    int updateByExample(@Param("record") DArea record, @Param("example") DAreaExample example);

    int updateByPrimaryKeySelective(DArea record);

    int updateByPrimaryKey(DArea record);
}