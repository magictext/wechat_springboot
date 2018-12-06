package com.wechat_springboot.standand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Student{
    @Id
    private String Id;

    @Column(nullable = false)
    private String Class;
    @Column(nullable = false)
    private String name;

    private boolean sex;


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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Id, student.Id) &&
                Objects.equals(Class, student.Class);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Class);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", Class='" + Class  + '\'' +
                '}';
    }
}
