package com.example.level1.mapper;

import com.example.level1.entity.Staff;
import com.example.level1.entity.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StaffMapper {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    long countByExample(StaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    int deleteByExample(StaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    int insert(Staff record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    int insertSelective(Staff record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    List<Staff> selectByExample(StaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);
}