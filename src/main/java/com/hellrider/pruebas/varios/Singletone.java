package com.hellrider.pruebas.varios;

import java.io.IOException;

public class Singletone {

    private static Singletone single_instance = null;

    public String x;

    private Singletone() {
        x = "hello, i'm a String of a singletone class";
    }

    public static synchronized Singletone getInstance() {
        if (single_instance == null) {
            single_instance = new Singletone();
        }
        return single_instance;
    }
}

class UsoSingleton {

    public static void main(String[] args) throws IOException {

    }
}
