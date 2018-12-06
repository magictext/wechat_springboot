package com.wechat_springboot.standand.entity;


import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StuClassCardPK implements Serializable {

    private String stuid;

    private String courseid;

    @Override
    public String toString() {
        return "StuClassCardPK{" +
                "stuid='" + stuid + '\'' +
                ", courseid='" + courseid + '\'' +
                '}';
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StuClassCardPK that = (StuClassCardPK) o;
        return Objects.equals(stuid, that.stuid) &&
                Objects.equals(courseid, that.courseid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid, courseid);
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }
}
