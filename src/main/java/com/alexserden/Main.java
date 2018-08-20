package com.alexserden;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        CollectionFixSize<Integer> col = new CollectionFixSize<>(6);
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(5);
        col.add(6);
        col.add(7);
        col.add(8);
        Arrays.stream(col.array()).forEach(x -> System.out.print(x));

    }
}
