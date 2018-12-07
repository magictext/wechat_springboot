package com.wechat_springboot.standand.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class Person {
    @Id
    private String Uid;

    private String ID;

    private boolean isTeacher;

    public boolean isTeacher() {
        return isTeacher;
    }

    public void setStudent(boolean student) {
        isTeacher = student;
    }

    public Person(String uid, String ID, boolean isTeacher) {
        Uid = uid;
        this.ID = ID;
        this.isTeacher = isTeacher;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "Uid='" + Uid + '\'' +
                ", ID='" + ID + '\'' +
                ", isTeacher=" + isTeacher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isTeacher == person.isTeacher &&
                Objects.equals(Uid, person.Uid) &&
                Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Uid, ID, isTeacher);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

}
