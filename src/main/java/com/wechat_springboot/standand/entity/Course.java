package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Course {
    @Id
    private String courseId;

    private String courseName;

    private String creater;

    private String createtime;

    private int studycount;

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
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
                Objects.equals(courseId, course.courseId) &&
                Objects.equals(courseName, course.courseName) &&
                Objects.equals(creater, course.creater) &&
                Objects.equals(createtime, course.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, creater, createtime, studycount);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
