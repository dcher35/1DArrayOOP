package com.edu.chmnu.ki_123.c3;

public class ArraySolution {
    private double[] array;

    public ArraySolution(double[] array) {
        this.array = array;
    }

    public ArrayRecord reverseArray() {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            double temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        return new ArrayRecord(array);
    }

    public ArrayRecord getResult() {
        return new ArrayRecord(array);
    }
}