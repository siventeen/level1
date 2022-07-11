package com.example.level1.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class DepStaff implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    private String id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    private String dep_id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    private String staff_id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    private String position;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column dep_staff.id
     *
     * @return the value of dep_staff.id
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public DepStaff withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column dep_staff.id
     *
     * @param id the value for dep_staff.id
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column dep_staff.dep_id
     *
     * @return the value of dep_staff.dep_id
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public String getDep_id() {
        return dep_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public DepStaff withDep_id(String dep_id) {
        this.setDep_id(dep_id);
        return this;
    }

    /**
     * This method sets the value of the database column dep_staff.dep_id
     *
     * @param dep_id the value for dep_staff.dep_id
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public void setDep_id(String dep_id) {
        this.dep_id = dep_id;
    }

    /**
     * This method returns the value of the database column dep_staff.staff_id
     *
     * @return the value of dep_staff.staff_id
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public String getStaff_id() {
        return staff_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public DepStaff withStaff_id(String staff_id) {
        this.setStaff_id(staff_id);
        return this;
    }

    /**
     * This method sets the value of the database column dep_staff.staff_id
     *
     * @param staff_id the value for dep_staff.staff_id
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    /**
     * This method returns the value of the database column dep_staff.position
     *
     * @return the value of dep_staff.position
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public String getPosition() {
        return position;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public DepStaff withPosition(String position) {
        this.setPosition(position);
        return this;
    }

    /**
     * This method sets the value of the database column dep_staff.position
     *
     * @param position the value for dep_staff.position
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dep_id=").append(dep_id);
        sb.append(", staff_id=").append(staff_id);
        sb.append(", position=").append(position);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
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
        DepStaff other = (DepStaff) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDep_id() == null ? other.getDep_id() == null : this.getDep_id().equals(other.getDep_id()))
            && (this.getStaff_id() == null ? other.getStaff_id() == null : this.getStaff_id().equals(other.getStaff_id()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()));
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:17 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDep_id() == null) ? 0 : getDep_id().hashCode());
        result = prime * result + ((getStaff_id() == null) ? 0 : getStaff_id().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return result;
    }
}