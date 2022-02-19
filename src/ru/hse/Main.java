package ru.hse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>();
        pair1.setFirst("abc");
        pair1.setSecond(123);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());

        Pair<String, String> pair2 = new Pair<>();
        pair2.setFirst("abc");
        pair2.setSecond("def");
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());

        Pair<ArrayList<Integer>, Object> pair3 = new Pair<>(new ArrayList<>(), new Object());
    }
}
