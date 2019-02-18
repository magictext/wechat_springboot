package com.wechat_springboot.standand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Student{
    @Id
    private String id;

    @Column(nullable = false)
    private String classes;

    @Column(nullable = false)
    private String name;

    private String info;

    private boolean sex;

    public Student(String id, String classes, String name, String info, boolean sex) {
        this.id = id;
        this.classes = classes;
        this.name = name;
        this.info = info;
        this.sex = sex;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Student() {
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", classes='" + classes + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                Objects.equals(id, student.id) &&
                Objects.equals(classes, student.classes) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, classes, name, sex);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
