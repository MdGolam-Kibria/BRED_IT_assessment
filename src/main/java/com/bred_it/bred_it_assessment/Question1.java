package com.bred_it.bred_it_assessment;

public class Question1 {
    public static int process(int base, int pow) {
        int result = 1;
        while (pow != 0) {
            result *= base;
            pow--;
        }
        return result;
    }
}
