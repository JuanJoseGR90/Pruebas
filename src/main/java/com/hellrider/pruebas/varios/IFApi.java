package com.hellrider.pruebas.varios;

import java.util.function.Function;

public interface IFApi {

    Function<Integer, Integer> multiplicar = i -> i * i;
    Function<Float, Float> dividir = i -> i / i;
    Function<Integer, Integer> sumar = i -> i + i;
    Function<Integer, Integer> restar = i -> i - i;

    static void main(String[] args) {

        int multiplicar = IFApi.multiplicar.apply(1);
        float dividir = IFApi.dividir.apply(2f);
        int suma = IFApi.sumar.apply(1);
        int restar = IFApi.restar.apply(1);

        System.out.println(multiplicar);
        System.out.println(dividir);
        System.out.println(suma);
        System.out.println(restar);
    }
}
