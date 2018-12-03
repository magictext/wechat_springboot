package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Class {
    @Id
    private String id;

    private String major;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(id, aClass.id) &&
                Objects.equals(major, aClass.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, major);
    }

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
