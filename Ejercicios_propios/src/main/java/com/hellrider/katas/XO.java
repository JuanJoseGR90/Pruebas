package com.hellrider.katas;

/**
 * Comprueba si una cadena tiene la misma cantidad de "x" y "o".
 * El métod debe devolver un valor booleano y no debe distinguir entre mayúsculas y minúsculas.
 * La cadena puede contener cualquier carácter.
 * */

public class XO {

    public static boolean getXO (String str) {

        int x = 0, o = 0;
        boolean result = false;

        for (Character c : str.toCharArray()) {

            c = Character.toLowerCase(c);

            if (c.equals('x')) {
                x++;
            } else if (c.equals('o')) {
                o++;
            }
        }
        return x == o;
    }
}
