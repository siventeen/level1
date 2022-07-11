package com.example.level1.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Participant implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    private String id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    private String staff_id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    private String meeting_id;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column participant.id
     *
     * @return the value of participant.id
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public Participant withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column participant.id
     *
     * @param id the value for participant.id
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column participant.staff_id
     *
     * @return the value of participant.staff_id
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public String getStaff_id() {
        return staff_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public Participant withStaff_id(String staff_id) {
        this.setStaff_id(staff_id);
        return this;
    }

    /**
     * This method sets the value of the database column participant.staff_id
     *
     * @param staff_id the value for participant.staff_id
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    /**
     * This method returns the value of the database column participant.meeting_id
     *
     * @return the value of participant.meeting_id
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public String getMeeting_id() {
        return meeting_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public Participant withMeeting_id(String meeting_id) {
        this.setMeeting_id(meeting_id);
        return this;
    }

    /**
     * This method sets the value of the database column participant.meeting_id
     *
     * @param meeting_id the value for participant.meeting_id
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public void setMeeting_id(String meeting_id) {
        this.meeting_id = meeting_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", staff_id=").append(staff_id);
        sb.append(", meeting_id=").append(meeting_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
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
        Participant other = (Participant) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStaff_id() == null ? other.getStaff_id() == null : this.getStaff_id().equals(other.getStaff_id()))
            && (this.getMeeting_id() == null ? other.getMeeting_id() == null : this.getMeeting_id().equals(other.getMeeting_id()));
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStaff_id() == null) ? 0 : getStaff_id().hashCode());
        result = prime * result + ((getMeeting_id() == null) ? 0 : getMeeting_id().hashCode());
        return result;
    }
}