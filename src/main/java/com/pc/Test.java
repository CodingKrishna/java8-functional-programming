package com.pc;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> ml = (x) -> x * x;

        int r3= ml.apply(4);
        System.out.println(r3);
        int r4= ml.apply(3);
        System.out.println(r4);
        Function<String, String>fun2=x->x.toUpperCase();
        String s= fun2.apply("king");
        System.out.println(s);
   }

  static void f1(Function<Integer,Integer> fun){
        int r1= fun.apply(2);
        int r2= fun.apply(6);
         System.out.println(r1+" "+r2);

//        Function<Integer,Integer>fun1 =x->x*x;
//              int i= fun.apply(4);
//              System.out.println(i);
//      System.out.println(fun.apply(4));

//        Function<String, String>fun2=x->x.toUpperCase();
//        System.out.println(fun.apply("king"));
//        String s= fun2.apply("king");
//        System.out.println(s);




    }
}
