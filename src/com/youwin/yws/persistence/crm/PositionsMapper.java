package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.Positions;
import com.youwin.yws.models.crm.PositionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionsMapper {
    int countByExample(PositionsExample example);

    int deleteByExample(PositionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Positions record);

    int insertSelective(Positions record);

    List<Positions> selectByExample(PositionsExample example);

    Positions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Positions record, @Param("example") PositionsExample example);

    int updateByExample(@Param("record") Positions record, @Param("example") PositionsExample example);

    int updateByPrimaryKeySelective(Positions record);

    int updateByPrimaryKey(Positions record);
}