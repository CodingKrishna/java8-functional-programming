package com.pc.comparable.comparator;

public class Person implements Comparable<Person> {
    int id;
    int marks ;
    String name;

    public Person(int id, int marks, String name) {
        this.id = id;
        this.marks=marks;
        this.name=name;
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
        String s = "Person [id=" + id + ", age=" + marks + ", name=" + name + "]";
        return s;
    	}
        public int compareTo(Person o) {
       return this.id-o.id;
//            return this.name.compareTo(o.name);

//            return this.name.compareTo(o.name);
    }
}
