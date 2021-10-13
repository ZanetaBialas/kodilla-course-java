package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int numbers[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,5,7,5,8,4,5};
        double averageExpected = 4.7;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(averageExpected, average, 0.0001);
    }
}
