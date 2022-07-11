package com.example.level1.mapper;

import com.example.level1.entity.Department;
import com.example.level1.entity.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DepartmentMapper {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    long countByExample(DepartmentExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int deleteByExample(DepartmentExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int insert(Department record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int insertSelective(Department record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    Department selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    int updateByPrimaryKey(Department record);
}