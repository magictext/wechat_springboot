package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Chat {
    @Id
    String courseid;
    ArrayList<ChatDate> arrayList;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public void add(ChatDate chatDate){
        if (arrayList.size()==100){
            arrayList.add(chatDate);
            arrayList.remove(0);
        }else arrayList.add(chatDate);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "courseid='" + courseid + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(courseid, chat.courseid) &&
                Objects.equals(arrayList, chat.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseid, arrayList);
    }

    public ArrayList<ChatDate> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<ChatDate> arrayList) {
        this.arrayList = arrayList;
    }
}
