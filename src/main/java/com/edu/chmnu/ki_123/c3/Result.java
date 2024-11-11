package com.edu.chmnu.ki_123.c3;

public class Result {
    public static void main(String[] args) {
        double[] initialArray = {1.2, -3.4, 9.6, 5.2, -6.3};

        ArraySolution solution = new ArraySolution(initialArray);

        System.out.println("Initial array:");
        System.out.println(solution.getResult());

        ArrayRecord reversedResult = solution.reverseArray();

        System.out.println("Array after reordering:");
        System.out.println(reversedResult);
    }
}