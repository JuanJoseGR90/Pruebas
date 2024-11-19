package com.hellrider.pruebas.varios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
public interface BiFunction <T,U,R> {

    String apply(T t, U u, R r);

    static void main(String[] args) {

        BiFunction<Integer, String, String> biFunction = (s1, s2, s3) -> s1 + s2 + s3;

        System.out.println(biFunction.apply(1, " Qué pasa mundo?", " :D"));

        BiFunction<Integer, String, String> biFunction2 = (s1, s2, s3) -> {
            int n = 1;

        return (s1 + n) + s2 + s3;
        };

        System.out.println(biFunction2.apply(1," XD", "??"));

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        Collections.sort(list, Collections.reverseOrder());

    }
}