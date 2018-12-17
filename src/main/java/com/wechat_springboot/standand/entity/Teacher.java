package com.wechat_springboot.standand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Teacher{
    @Id
    private String ID;
    @Column(nullable = true)
    private Integer score;
    @Column(nullable = false)
    private String name;
    @Column(nullable = true)
    private Integer age;
    @Column(nullable = true)
    private boolean sex;
    @Column(nullable = true)
    private Integer salary;
    @Column(nullable = true)
    public ArrayList classes;

    public Teacher() {
        //setClasses(new ArrayList<Integer>());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ID='" + ID + '\'' +
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
                Objects.equals(ID, teacher.ID) &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(classes, teacher.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, score, name, age, sex, salary, classes);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public Teacher(String ID, int score, String name, int age, boolean sex, int salary, ArrayList classes) {
        this.ID = ID;
        this.score = score;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.classes = classes;
    }
}
