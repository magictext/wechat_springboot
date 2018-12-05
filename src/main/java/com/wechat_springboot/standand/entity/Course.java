package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Course {
    @Id
    private String CourseId;

    private String creater;

    private String createtime;

    private int studycount;

    @Override
    public String toString() {
        return "Course{" +
                "CourseId='" + CourseId + '\'' +
                ", creater='" + creater + '\'' +
                ", createtime='" + createtime + '\'' +
                ", studycount=" + studycount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return studycount == course.studycount &&
                Objects.equals(CourseId, course.CourseId) &&
                Objects.equals(creater, course.creater) &&
                Objects.equals(createtime, course.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CourseId, creater, createtime, studycount);
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getStudycount() {
        return studycount;
    }

    public void setStudycount(int studycount) {
        this.studycount = studycount;
    }
}
