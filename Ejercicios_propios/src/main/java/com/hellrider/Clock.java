package com.hellrider;

public class Clock {

    public static int Past(int h, int m, int s)
    {
        int result = 0;

        h = h*60;
        h = h*60;
        h = h*1000;

        m = m*60;
        m = m*1000;

        s = s*1000;

        result = h + m + s;

        return result;
    }
}
