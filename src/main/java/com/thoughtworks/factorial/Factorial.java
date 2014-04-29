package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else if (i == 2) {
            return 2;
        } else if (i < 1) {
            throw new IllegalArgumentException();
        } else {
            return i + compute(i - 1) + compute(i - 2);
        }
    }
}
