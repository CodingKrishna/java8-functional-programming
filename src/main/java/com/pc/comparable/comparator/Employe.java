package com.pc.comparable.comparator;

public class Employe implements Comparable<Employe> {
    int id;
    String name;
    int marks;

    @Override
    public int compareTo(Employe o) {
        return this.id-o.id;
//        return this.name.compareTo(o.name);



    }
}
