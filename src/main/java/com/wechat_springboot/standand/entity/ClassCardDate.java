package com.wechat_springboot.standand.entity;

import java.io.Serializable;

public class ClassCardDate implements Serializable {
    private int week;
    private int time;
    private String roomid;
    private String coursename;
    private String teacherName;

    public ClassCardDate(int week, int time, String roomid, String coursename, String teacherName) {
        this.week = week;
        this.time = time;
        this.roomid = roomid;
        this.coursename = coursename;
        this.teacherName = teacherName;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getWeek() {
        return week;
    }

    public int getTime() {
        return time;
    }

    public String getRoomid() {
        return roomid;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public ClassCardDate() {
    }
}
