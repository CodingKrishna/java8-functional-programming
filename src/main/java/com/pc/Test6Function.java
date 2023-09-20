package com.pc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test6Function {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(70);
//      Function<Integer,Void>displayfun=x->System.out.println(x);
        l.stream().forEach(x-> System.out.println(x));



    }
}
