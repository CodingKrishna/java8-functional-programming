package com.pc.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person(2,85,"Ruby");
        Person p1=new Person(1,80,"otic");
        Person p2=new Person(3,90,"meave");
        ArrayList<Person>pp=new ArrayList<>();
        pp.add(p);
        pp.add(p1);
        pp.add(p2);
        Collections.sort(pp);
        pp.stream().forEach(x-> System.out.println(x));
        System.out.println(pp);


    }
}
