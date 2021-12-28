package com.example.demorestfulwebservice.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double score;
    private int age;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private Clazz clazz;

    public Student() {
    }

    public Student(String name, double score, int age, Clazz clazz) {
        this.name = name;
        this.score = score;
        this.age = age;
        this.clazz = clazz;
    }

    public Student(long id, String name, double score, int age, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
        this.clazz = clazz;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
