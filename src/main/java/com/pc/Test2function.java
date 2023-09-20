package com.pc;

import java.util.function.Function;

public class Test2function {
    public static void main(String[] args) {
        Function<String,String>tup=x->x.toUpperCase();
        Function<Integer,Integer>tup1=y->y+y;
        f1(tup,tup1);
    }
  static void f1(Function<String,String>tupfun,Function<Integer,Integer>tup1fun){
        String s= tupfun.apply("king");
        System.out.println(s);
        int i=tup1fun.apply(1);
      System.out.println(i);

  }

}
