package com.hellrider.katas;

public class Kata {

    public static String noSpace(final String x) {

        for (Character s : x.toCharArray()) {
            if (s.equals(' ')) {
                return x.replace(" ", "");
            }
        }

        return x;
    }
}
