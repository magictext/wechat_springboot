package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class StuClassCard implements Serializable {
    @Id
    private String stuid;
    @Id
    private String courseid;

    private int week;

    private int time;

    private String teacherid;

    private String roomid;

    private String testroomid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StuClassCard that = (StuClassCard) o;
        return week == that.week &&
                time == that.time &&
                Objects.equals(stuid, that.stuid) &&
                Objects.equals(courseid, that.courseid) &&
                Objects.equals(teacherid, that.teacherid) &&
                Objects.equals(roomid, that.roomid) &&
                Objects.equals(testroomid, that.testroomid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid, courseid, week, time, teacherid, roomid, testroomid);
    }

    @Override
    public String toString() {
        return "StuClassCard{" +
                "stuid='" + stuid + '\'' +
                ", courseid='" + courseid + '\'' +
                ", week=" + week +
                ", time=" + time +
                ", teacherid='" + teacherid + '\'' +
                ", roomid='" + roomid + '\'' +
                ", testroomid='" + testroomid + '\'' +
                '}';
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }
}
