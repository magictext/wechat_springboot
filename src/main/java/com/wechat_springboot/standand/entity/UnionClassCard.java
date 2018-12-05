package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class UnionClassCard implements Serializable {
    @Id
    private String classid;
    @Id
    private String courseid;

    private int week;

    private int time;

    private String teacherid;

    private String roomid;

    private String testroomid;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getClassid() {
        return classid;
    }



    public void setClassid(String classid) {
        this.classid = classid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnionClassCard that = (UnionClassCard) o;
        return week == that.week &&
                time == that.time &&
                Objects.equals(classid, that.classid) &&
                Objects.equals(courseid, that.courseid) &&
                Objects.equals(teacherid, that.teacherid) &&
                Objects.equals(roomid, that.roomid) &&
                Objects.equals(testroomid, that.testroomid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classid, courseid, week, time, teacherid, roomid, testroomid);
    }

    @Override
    public String toString() {
        return "UnionClassCard{" +
                "classid='" + classid + '\'' +
                ", courseid='" + courseid + '\'' +
                ", week=" + week +
                ", time=" + time +
                ", teacherid='" + teacherid + '\'' +
                ", roomid='" + roomid + '\'' +
                ", testroomid='" + testroomid + '\'' +
                '}';
    }
}
