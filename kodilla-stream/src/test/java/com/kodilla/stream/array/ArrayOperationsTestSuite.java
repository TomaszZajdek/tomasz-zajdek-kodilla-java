package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] integerTable = new int[20];
        for(int i = 0; i < integerTable.length; i++) {
            integerTable[i] = i * 10;  // sum = 1900
        }
        //when
       double avarage = ArrayOperations.getAverage(integerTable);
        //then
        Assertions.assertEquals(95, avarage);
    }
}
