package com.wechat_springboot.standand.entity;

import javafx.scene.image.Image;

import java.util.Objects;

public class ChatDate {
    String name;
    String date;
    String imageurl;

    public ChatDate(String name, String date, String imageurl) {
        this.name = name;
        this.date = date;
        this.imageurl = imageurl;
    }

    public ChatDate(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ChatDate{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatDate chatDate = (ChatDate) o;
        return Objects.equals(name, chatDate.name) &&
                Objects.equals(date, chatDate.date) &&
                Objects.equals(imageurl, chatDate.imageurl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, imageurl);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
