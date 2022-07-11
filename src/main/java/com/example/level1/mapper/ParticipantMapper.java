package com.example.level1.mapper;

import com.example.level1.entity.Participant;
import com.example.level1.entity.ParticipantExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ParticipantMapper {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    long countByExample(ParticipantExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int deleteByExample(ParticipantExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int insert(Participant record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int insertSelective(Participant record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    List<Participant> selectByExample(ParticipantExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    Participant selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int updateByExampleSelective(@Param("record") Participant record, @Param("example") ParticipantExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int updateByExample(@Param("record") Participant record, @Param("example") ParticipantExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int updateByPrimaryKeySelective(Participant record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    int updateByPrimaryKey(Participant record);
}