package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public record ArrayRecord(double[] array) {

    @Override
    public String toString() {
        return "Array: " + Arrays.toString(array);
    }
}