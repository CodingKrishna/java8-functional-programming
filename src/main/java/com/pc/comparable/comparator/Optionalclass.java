package com.pc.comparable.comparator;

import java.util.Optional;

public class Optionalclass {
    public static void main(String[] args) {
        String s="king";
        s= Optional.ofNullable(s).map(x->x.toUpperCase()).orElse("");
        System.out.println(s);
    }
}
