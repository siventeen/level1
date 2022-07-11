package com.example.level1.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Company implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    private String id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    private String description;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    private String name;

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column company.id
     *
     * @return the value of company.id
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public Company withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column company.id
     *
     * @param id the value for company.id
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column company.description
     *
     * @return the value of company.description
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public Company withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method sets the value of the database column company.description
     *
     * @param description the value for company.description
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method returns the value of the database column company.name
     *
     * @return the value of company.name
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public Company withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column company.name
     *
     * @param name the value for company.name
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", description=").append(description);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
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
        Company other = (Company) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:29:42 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}