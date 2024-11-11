package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySolutionTest {

    //Тест для перевірки початкового стану масиву
    @Test
    public void testInitialArray() {
        double[] initialArray = {1.2, -3.4, 9.6, 5.2, -6.3};
        ArraySolution solution = new ArraySolution(initialArray);

        ArrayRecord result = solution.getResult();
        double[] expectedArray = {1.2, -3.4, 9.6, 5.2, -6.3};

        assertArrayEquals(expectedArray, result.array(), "The initial array does not match the expected one");
    }

    //Тест для перевірки перевертання масиву
    @Test
    public void testReverseArray() {
        double[] initialArray = {1.2, -3.4, 9.6, 5.2, -6.3};
        ArraySolution solution = new ArraySolution(initialArray);

        ArrayRecord reversedResult = solution.reverseArray();

        double[] expectedArray = {-6.3, 5.2, 9.6, -3.4, 1.2};

        assertArrayEquals(expectedArray, reversedResult.array(), "The inverted array does not match the expected one");
    }

    //Тест для перевірки правильності рядкового представлення масиву
    @Test
    public void testToString() {
        double[] initialArray = {1.2, -3.4, 9.6, 5.2, -6.3};
        ArrayRecord result = new ArrayRecord(initialArray);

        String expectedString = "Array: [1.2, -3.4, 9.6, 5.2, -6.3]";

        assertEquals(expectedString, result.toString(), "The string representation of the array is not as expected");
    }
}