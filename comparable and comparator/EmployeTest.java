package javaEightcompare;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeTest {

    public static void main(String[] args) {
        ArrayList<Employe>emp=new ArrayList<>();
        Employe e=new Employe();
        e.id=5;
        e.name="king";
        e.marks=90;
        Employe e1=new Employe();
        e1.id=4;
        e1.name="queen";
        e1.marks=85;
        Employe e2=new Employe();
        e2.id=6;
        e2.name="jack";
        e2.marks=75;

        Employe e3=new Employe();
        e3.id=2;
        e3.name="ruby";
        e3.marks=68;

        emp.add(e);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        Collections.sort(emp);
        emp.stream().forEach(x-> System.out.println(x.id+" "+x.name+" "+x.marks));

    }
}
