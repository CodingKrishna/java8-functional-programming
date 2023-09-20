package com.pc.comparable.comparator;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    int id;
    int marks;
    String name;

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
