package com.wechat_springboot.standand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Teacher{
    @Id
    private String id;
    @Column(nullable = true)
    private int score;
    @Column(nullable = false)
    private String name;
    @Column(nullable = true)
    private int age;
    @Column(nullable = true)
    private boolean sex;
    @Column(nullable = true)
    private int salary;
    @Column(nullable = true)
    public ArrayList classes;

    private String uid;
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }

    private String info;

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public Teacher() {
        //setClasses(new ArrayList<Integer>());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", salary=" + salary +
                ", classes=" + classes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return score == teacher.score &&
                age == teacher.age &&
                sex == teacher.sex &&
                salary == teacher.salary &&
                Objects.equals(id, teacher.id) &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(classes, teacher.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score, name, age, sex, salary, classes);
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList getClasses() {
        return classes;
    }

    public void setClasses(ArrayList classes) {
        this.classes = classes;
    }

    public Teacher(String id, int score, String name, int age, boolean sex, int salary, ArrayList classes) {
        this.id = id;
        this.score = score;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.classes = classes;
    }
}
