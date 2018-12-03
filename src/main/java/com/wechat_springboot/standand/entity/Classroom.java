package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Classroom {
    @Id
    private String roomid;

    private int Maxcount;

    private boolean isuse;

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public int getMaxcount() {
        return Maxcount;
    }

    public void setMaxcount(int maxcount) {
        Maxcount = maxcount;
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse) {
        this.isuse = isuse;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "roomid='" + roomid + '\'' +
                ", Maxcount=" + Maxcount +
                ", isuse=" + isuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return Maxcount == classroom.Maxcount &&
                isuse == classroom.isuse &&
                Objects.equals(roomid, classroom.roomid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomid, Maxcount, isuse);
    }
}
