package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    @DisplayName("Test when list is empty")
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> listWithoutOddNumbers = oddNumbersExterminator.exterminate(new ArrayList<>());
        System.out.println("Testing " + listWithoutOddNumbers);
        //Testing
        Assertions.assertTrue(listWithoutOddNumbers.isEmpty());
    }

    @Test
    @DisplayName("Test when list contains even and odd numbers")
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expectedEvenNumbers = Arrays.asList(2, 4, 6, 8);
        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing " + evenNumbers);
        Assertions.assertEquals(expectedEvenNumbers, evenNumbers);
    }
}

