package com.example.level1.mapper;

import com.example.level1.entity.MeetingRoom;
import com.example.level1.entity.MeetingRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MeetingRoomMapper {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    long countByExample(MeetingRoomExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int deleteByExample(MeetingRoomExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int insert(MeetingRoom record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int insertSelective(MeetingRoom record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    List<MeetingRoom> selectByExample(MeetingRoomExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    MeetingRoom selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int updateByExampleSelective(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int updateByExample(@Param("record") MeetingRoom record, @Param("example") MeetingRoomExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int updateByPrimaryKeySelective(MeetingRoom record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:22 CST 2022
     */
    int updateByPrimaryKey(MeetingRoom record);
}