package com.wechat_springboot.standand.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UnionClassCardPK implements Serializable {
    @Column(length = 16)
    private String classid;
    @Column(length = 16)
    private String courseid;

    @Override
    public String toString() {
        return "UnionClassCardPK{" +
                "classid='" + classid + '\'' +
                ", courseid='" + courseid + '\'' +
                '}';
    }

    public UnionClassCardPK(String classid, String courseid) {
        this.classid = classid;
        this.courseid = courseid;
    }

    public UnionClassCardPK() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnionClassCardPK that = (UnionClassCardPK) o;
        return Objects.equals(classid, that.classid) &&
                Objects.equals(courseid, that.courseid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classid, courseid);
    }

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
}
