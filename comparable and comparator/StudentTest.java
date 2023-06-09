package javaEightcompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        Student st=new Student(2,80,"meave");
        Student st1=new Student(1,85,"ruby");
        Student st2=new Student(4,90,"king");
        Student st3=new Student(3,82,"queen");
        ArrayList<Student>s=new ArrayList<>();
        s.add(st);
        s.add(st1);
        s.add(st2);
        s.add(st3);
        Collections.sort(s,st);
        s.stream().forEach(x-> System.out.println(x));
        System.out.println(s);
    }
}
