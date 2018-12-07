package com.wechat_springboot.standand.entity;

public class ClassCardDate {
    private int week;
    private int time;
    private String coursename;
    private String teacherName;

    public ClassCardDate(int week, int time, String coursename, String teacherName) {
        this.week = week;
        this.time = time;
        this.coursename = coursename;
        this.teacherName = teacherName;
    }

    public ClassCardDate() {
    }
}
