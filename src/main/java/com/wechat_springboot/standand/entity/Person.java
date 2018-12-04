package com.wechat_springboot.standand.entity;


import javax.persistence.Id;
import java.util.Objects;

public class Person {
    @Id
    private String Uid;

    private String ID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Uid, person.Uid) &&
                Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Uid, ID);
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "Uid='" + Uid + '\'' +
                ", ID='" + ID + '\'' +
                '}';
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
