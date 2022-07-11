package com.example.level1.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Meeting implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private String id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private Date start_time;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private Date end_time;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private Boolean is_period;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private Byte status;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private String room_id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private String reserve_person_id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private Boolean is_video;

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column meeting.id
     *
     * @return the value of meeting.id
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.id
     *
     * @param id the value for meeting.id
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column meeting.name
     *
     * @return the value of meeting.name
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.name
     *
     * @param name the value for meeting.name
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column meeting.start_time
     *
     * @return the value of meeting.start_time
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Date getStart_time() {
        return start_time;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withStart_time(Date start_time) {
        this.setStart_time(start_time);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.start_time
     *
     * @param start_time the value for meeting.start_time
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    /**
     * This method returns the value of the database column meeting.end_time
     *
     * @return the value of meeting.end_time
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withEnd_time(Date end_time) {
        this.setEnd_time(end_time);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.end_time
     *
     * @param end_time the value for meeting.end_time
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * This method returns the value of the database column meeting.is_period
     *
     * @return the value of meeting.is_period
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Boolean getIs_period() {
        return is_period;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withIs_period(Boolean is_period) {
        this.setIs_period(is_period);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.is_period
     *
     * @param is_period the value for meeting.is_period
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setIs_period(Boolean is_period) {
        this.is_period = is_period;
    }

    /**
     * This method returns the value of the database column meeting.status
     *
     * @return the value of meeting.status
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Byte getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.status
     *
     * @param status the value for meeting.status
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column meeting.room_id
     *
     * @return the value of meeting.room_id
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public String getRoom_id() {
        return room_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withRoom_id(String room_id) {
        this.setRoom_id(room_id);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.room_id
     *
     * @param room_id the value for meeting.room_id
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    /**
     * This method returns the value of the database column meeting.reserve_person_id
     *
     * @return the value of meeting.reserve_person_id
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public String getReserve_person_id() {
        return reserve_person_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withReserve_person_id(String reserve_person_id) {
        this.setReserve_person_id(reserve_person_id);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.reserve_person_id
     *
     * @param reserve_person_id the value for meeting.reserve_person_id
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setReserve_person_id(String reserve_person_id) {
        this.reserve_person_id = reserve_person_id;
    }

    /**
     * This method returns the value of the database column meeting.is_video
     *
     * @return the value of meeting.is_video
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Boolean getIs_video() {
        return is_video;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public Meeting withIs_video(Boolean is_video) {
        this.setIs_video(is_video);
        return this;
    }

    /**
     * This method sets the value of the database column meeting.is_video
     *
     * @param is_video the value for meeting.is_video
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    public void setIs_video(Boolean is_video) {
        this.is_video = is_video;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", start_time=").append(start_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", is_period=").append(is_period);
        sb.append(", status=").append(status);
        sb.append(", room_id=").append(room_id);
        sb.append(", reserve_person_id=").append(reserve_person_id);
        sb.append(", is_video=").append(is_video);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
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
        Meeting other = (Meeting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStart_time() == null ? other.getStart_time() == null : this.getStart_time().equals(other.getStart_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getIs_period() == null ? other.getIs_period() == null : this.getIs_period().equals(other.getIs_period()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRoom_id() == null ? other.getRoom_id() == null : this.getRoom_id().equals(other.getRoom_id()))
            && (this.getReserve_person_id() == null ? other.getReserve_person_id() == null : this.getReserve_person_id().equals(other.getReserve_person_id()))
            && (this.getIs_video() == null ? other.getIs_video() == null : this.getIs_video().equals(other.getIs_video()));
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:07 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStart_time() == null) ? 0 : getStart_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getIs_period() == null) ? 0 : getIs_period().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRoom_id() == null) ? 0 : getRoom_id().hashCode());
        result = prime * result + ((getReserve_person_id() == null) ? 0 : getReserve_person_id().hashCode());
        result = prime * result + ((getIs_video() == null) ? 0 : getIs_video().hashCode());
        return result;
    }
}