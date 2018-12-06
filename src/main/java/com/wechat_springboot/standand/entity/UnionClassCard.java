package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class UnionClassCard implements Serializable {

    @Id
    private UnionClassCardPK unionClassCardPK;

    private int week;

    private int time;

    private String teacherid;

    private String roomid;

    private String testroomid;

    public UnionClassCardPK getUnionClassCardPK() {
        return unionClassCardPK;
    }

    public void setUnionClassCardPK(UnionClassCardPK unionClassCardPK) {
        this.unionClassCardPK = unionClassCardPK;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getTestroomid() {
        return testroomid;
    }

    public void setTestroomid(String testroomid) {
        this.testroomid = testroomid;
    }

    @Override
    public String toString() {
        return "UnionClassCard{" +
                "unionClassCardPK=" + unionClassCardPK +
                ", week=" + week +
                ", time=" + time +
                ", teacherid='" + teacherid + '\'' +
                ", roomid='" + roomid + '\'' +
                ", testroomid='" + testroomid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnionClassCard that = (UnionClassCard) o;
        return week == that.week &&
                time == that.time &&
                Objects.equals(unionClassCardPK, that.unionClassCardPK) &&
                Objects.equals(teacherid, that.teacherid) &&
                Objects.equals(roomid, that.roomid) &&
                Objects.equals(testroomid, that.testroomid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unionClassCardPK, week, time, teacherid, roomid, testroomid);
    }
}
