package com.example.level1.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Department implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    private String id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    private String higher_dep_id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    private String company_id;

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public Department withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column department.id
     *
     * @param id the value for department.id
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column department.name
     *
     * @return the value of department.name
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public Department withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column department.name
     *
     * @param name the value for department.name
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column department.higher_dep_id
     *
     * @return the value of department.higher_dep_id
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public String getHigher_dep_id() {
        return higher_dep_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public Department withHigher_dep_id(String higher_dep_id) {
        this.setHigher_dep_id(higher_dep_id);
        return this;
    }

    /**
     * This method sets the value of the database column department.higher_dep_id
     *
     * @param higher_dep_id the value for department.higher_dep_id
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public void setHigher_dep_id(String higher_dep_id) {
        this.higher_dep_id = higher_dep_id;
    }

    /**
     * This method returns the value of the database column department.company_id
     *
     * @return the value of department.company_id
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public String getCompany_id() {
        return company_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public Department withCompany_id(String company_id) {
        this.setCompany_id(company_id);
        return this;
    }

    /**
     * This method sets the value of the database column department.company_id
     *
     * @param company_id the value for department.company_id
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", higher_dep_id=").append(higher_dep_id);
        sb.append(", company_id=").append(company_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getHigher_dep_id() == null ? other.getHigher_dep_id() == null : this.getHigher_dep_id().equals(other.getHigher_dep_id()))
            && (this.getCompany_id() == null ? other.getCompany_id() == null : this.getCompany_id().equals(other.getCompany_id()));
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:04 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getHigher_dep_id() == null) ? 0 : getHigher_dep_id().hashCode());
        result = prime * result + ((getCompany_id() == null) ? 0 : getCompany_id().hashCode());
        return result;
    }
}