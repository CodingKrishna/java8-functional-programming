package com.pc;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(70);

        l.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(x -> System.out.println(x));


    }
}
