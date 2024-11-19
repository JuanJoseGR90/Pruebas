package com.hellrider.pruebas.varios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Listas {

    public static void transformAndAdd(List<Integer> l, Function<Integer, Integer> ops) {
        int result = 0;
        for (Integer s : l) {
            result += ops.apply(s);
        }
        l.add(result);
    }

    public static void main(String[] args) {
//        List<Integer> listaEnteros = new ArrayList<>();
//        listaEnteros.add(1);
//        listaEnteros.add(2);
//        listaEnteros.add(3);
//
//        listaEnteros.forEach(System.out::println);
//
//        Listas.transformAndAdd(listaEnteros, integer -> integer + 1);
//
//        listaEnteros.forEach(System.out::println);

    ArrayList<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);

        l.forEach(System.out::println);
    }
}
