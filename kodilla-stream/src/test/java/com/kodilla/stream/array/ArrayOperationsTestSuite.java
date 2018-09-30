package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {2, 1, 3, 5, 6, 2, 3, 6, 3, 3, 3, 6, 4, 5, 6, 2, 1, 3, 3, 2};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(3.45, result, 0.001);
    }
}
