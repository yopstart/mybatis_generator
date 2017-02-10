package com.youwin.yws.dao;

import com.youwin.yws.entity.HelpTopic;
import com.youwin.yws.entity.HelpTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpTopicMapper {
    /**
     *  根据指定的条件获取数据库记录数,help_topic
     *
     * @param example
     */
    int countByExample(HelpTopicExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,help_topic
     *
     * @param example
     */
    int deleteByExample(HelpTopicExample example);

    /**
     *  根据主键删除数据库的记录,help_topic
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,help_topic
     *
     * @param record
     */
    int insert(HelpTopic record);

    /**
     *  动态字段,写入数据库记录,help_topic
     *
     * @param record
     */
    int insertSelective(HelpTopic record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,help_topic
     *
     * @param example
     */
    List<HelpTopic> selectByExample(HelpTopicExample example);

    /**
     *  根据指定主键获取一条数据库记录,help_topic
     *
     * @param id
     */
    HelpTopic selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,help_topic
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,help_topic
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,help_topic
     *
     * @param record
     */
    int updateByPrimaryKeySelective(HelpTopic record);

    /**
     *  根据主键来更新符合条件的数据库记录,help_topic
     *
     * @param record
     */
    int updateByPrimaryKey(HelpTopic record);
}