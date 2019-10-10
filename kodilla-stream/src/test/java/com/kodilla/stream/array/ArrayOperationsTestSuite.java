package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        // Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] numbers2 = {10, 5};

        // When
        double resultAvgNumbers = ArrayOperations.getAverage(numbers);
        double resultAvgNumbers2 = ArrayOperations.getAverage(numbers2);

        // Then
        Assert.assertEquals(10.5, resultAvgNumbers, 0);
        Assert.assertEquals(7.5, resultAvgNumbers2, 0);
    }

}
