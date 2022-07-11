package com.example.level1.dao;

import com.example.level1.entity.DepStaff;
import com.example.level1.entity.DepStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DepStaffMapper {
    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    long countByExample(DepStaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int deleteByExample(DepStaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int insert(DepStaff record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int insertSelective(DepStaff record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    List<DepStaff> selectByExample(DepStaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    DepStaff selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int updateByExampleSelective(@Param("record") DepStaff record, @Param("example") DepStaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int updateByExample(@Param("record") DepStaff record, @Param("example") DepStaffExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int updateByPrimaryKeySelective(DepStaff record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:32:54 CST 2022
     */
    int updateByPrimaryKey(DepStaff record);
}