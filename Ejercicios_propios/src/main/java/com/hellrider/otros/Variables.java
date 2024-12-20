package com.hellrider.otros;

public class Variables {

//    Variables
    static int n = 0;

//    Métodos
    public static void buscaImparesExcluyendoNumeroSiete (int numero) {
        for (n = 0; n <= numero; n++) {
            if (n % 2 == 0) {
                continue;
            }
            if (n == 7) {
                continue;
            }
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        buscaImparesExcluyendoNumeroSiete(20);
    }
}
