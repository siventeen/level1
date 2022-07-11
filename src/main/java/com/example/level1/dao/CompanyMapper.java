package com.example.level1.dao;

import com.example.level1.entity.Company;
import com.example.level1.entity.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyMapper {
    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    long countByExample(CompanyExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int deleteByExample(CompanyExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int insert(Company record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int insertSelective(Company record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    Company selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    int updateByPrimaryKey(Company record);
}