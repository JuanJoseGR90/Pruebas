package com.hellrider.pruebas.varios;

public class Prueba {

    public static void main(String[] args) {
        ThreadTest hilo = new ThreadTest();
        Thread t1 = new Thread(hilo);
        HilosThread t2 = new HilosThread();

        t1.start();
        t2.start();
    }
}
