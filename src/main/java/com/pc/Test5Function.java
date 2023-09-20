package com.pc;

import java.util.function.Function;

public class Test5Function {
    public static void main(String[] args) {
        Function<Integer,Boolean>iseven=x->x%2==0;
        f1(iseven);
    }
  static void f1(Function<Integer,Boolean>fun){
        Boolean r1=fun.apply(4);
      System.out.println(r1);
  }
}
