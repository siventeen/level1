package com.example.level1.dao;

import com.example.level1.entity.Meeting;
import com.example.level1.entity.MeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MeetingMapper {
    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    long countByExample(MeetingExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int deleteByExample(MeetingExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int insert(Meeting record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int insertSelective(Meeting record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    List<Meeting> selectByExample(MeetingExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    Meeting selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int updateByExampleSelective(@Param("record") Meeting record, @Param("example") MeetingExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int updateByExample(@Param("record") Meeting record, @Param("example") MeetingExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int updateByPrimaryKeySelective(Meeting record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    int updateByPrimaryKey(Meeting record);
}