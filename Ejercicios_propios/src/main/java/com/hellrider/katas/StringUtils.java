package com.hellrider.katas;

public class StringUtils {

    public static String toAlternativeString(String texto) {

        StringBuilder nuevoTexto = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLowerCase(c)) {
                nuevoTexto.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                nuevoTexto.append(Character.toLowerCase(c));
            } else {
                nuevoTexto.append(c); // Mantiene caracteres no alfabéticos
            }
        }

        return nuevoTexto.toString();
    }
}