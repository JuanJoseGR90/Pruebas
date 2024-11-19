package com.hellrider.pruebas.varios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
public interface IFStrings {

    String setName(String nombre);
}

class UsoIFStrings {

    public static void main(String[] args) {
//        String nombre;
//
//        IFStrings ans = (String n) -> n;
//
//        nombre = ans.setName("JJ");
//
//        System.out.println(nombre);
//
//        // create a list of strings
//        List<String> names = Arrays.asList(
//                "Geek", "GeeksQuiz", "g1", "QA", "Geek2");
//
//        // declare the predicate type as string and use
//        // lambda expression to create object
//        Predicate<String> p = (s) -> s.startsWith("G");
//
//        // Iterate through the list
//        for (String st : names) {
//            // call the test method
//            if (p.test(st))
//                System.out.println(st);

            // Creating an List of integer type
            List<Integer> list = Arrays.asList(
                    234, 780, 451, 639, 456, 98, 75, 43);

            // Printing List before sorting
            System.out.println("Before Sorting");

            for (int i : list)
                System.out.print(i + " ");

            System.out.println();

            // Comparator is a functional interface
            // which is helps to sort object
            Collections.sort(list, (a1, a2) -> a1 % 10 > a2 % 10 ? 1 : -1);

            // Printing the list after sorting
            System.out.println("After Sorting");

            for (int i : list)
                System.out.print(i + " ");

            System.out.println();
        }
    }

