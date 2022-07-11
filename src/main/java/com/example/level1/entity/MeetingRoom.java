package com.example.level1.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class MeetingRoom implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    private String id;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    private Integer seat_number;

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column meeting_room.id
     *
     * @return the value of meeting_room.id
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public MeetingRoom withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column meeting_room.id
     *
     * @param id the value for meeting_room.id
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column meeting_room.name
     *
     * @return the value of meeting_room.name
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public MeetingRoom withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column meeting_room.name
     *
     * @param name the value for meeting_room.name
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column meeting_room.seat_number
     *
     * @return the value of meeting_room.seat_number
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public Integer getSeat_number() {
        return seat_number;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public MeetingRoom withSeat_number(Integer seat_number) {
        this.setSeat_number(seat_number);
        return this;
    }

    /**
     * This method sets the value of the database column meeting_room.seat_number
     *
     * @param seat_number the value for meeting_room.seat_number
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    public void setSeat_number(Integer seat_number) {
        this.seat_number = seat_number;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", seat_number=").append(seat_number);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
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
        MeetingRoom other = (MeetingRoom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSeat_number() == null ? other.getSeat_number() == null : this.getSeat_number().equals(other.getSeat_number()));
    }

    /**
     *
     * @mbg.generated Mon Jul 11 16:33:09 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSeat_number() == null) ? 0 : getSeat_number().hashCode());
        return result;
    }
}