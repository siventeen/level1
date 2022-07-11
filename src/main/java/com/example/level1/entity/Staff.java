package com.example.level1.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Staff implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    private String id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    private String sex;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    private String phone;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    private String cloud_account;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    private String cloud_password;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column staff.id
     *
     * @return the value of staff.id
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public Staff withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column staff.id
     *
     * @param id the value for staff.id
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column staff.name
     *
     * @return the value of staff.name
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public Staff withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column staff.name
     *
     * @param name the value for staff.name
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column staff.sex
     *
     * @return the value of staff.sex
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public Staff withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    /**
     * This method sets the value of the database column staff.sex
     *
     * @param sex the value for staff.sex
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method returns the value of the database column staff.phone
     *
     * @return the value of staff.phone
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public Staff withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column staff.phone
     *
     * @param phone the value for staff.phone
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method returns the value of the database column staff.cloud_account
     *
     * @return the value of staff.cloud_account
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public String getCloud_account() {
        return cloud_account;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public Staff withCloud_account(String cloud_account) {
        this.setCloud_account(cloud_account);
        return this;
    }

    /**
     * This method sets the value of the database column staff.cloud_account
     *
     * @param cloud_account the value for staff.cloud_account
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setCloud_account(String cloud_account) {
        this.cloud_account = cloud_account;
    }

    /**
     * This method returns the value of the database column staff.cloud_password
     *
     * @return the value of staff.cloud_password
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public String getCloud_password() {
        return cloud_password;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public Staff withCloud_password(String cloud_password) {
        this.setCloud_password(cloud_password);
        return this;
    }

    /**
     * This method sets the value of the database column staff.cloud_password
     *
     * @param cloud_password the value for staff.cloud_password
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setCloud_password(String cloud_password) {
        this.cloud_password = cloud_password;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", cloud_account=").append(cloud_account);
        sb.append(", cloud_password=").append(cloud_password);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
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
        Staff other = (Staff) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCloud_account() == null ? other.getCloud_account() == null : this.getCloud_account().equals(other.getCloud_account()))
            && (this.getCloud_password() == null ? other.getCloud_password() == null : this.getCloud_password().equals(other.getCloud_password()));
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCloud_account() == null) ? 0 : getCloud_account().hashCode());
        result = prime * result + ((getCloud_password() == null) ? 0 : getCloud_password().hashCode());
        return result;
    }
}