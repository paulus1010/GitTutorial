package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case started...");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case finished.");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite started...");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite finished.");
    }

    @DisplayName("When a non empty collection of integer numbers is given the all odd numbers are exterminated")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> allNumbers = new ArrayList<>();
        allNumbers.add(19);
        allNumbers.add(24);
        allNumbers.add(133);
        allNumbers.add(5);
        allNumbers.add(61);
        allNumbers.add(34);
        allNumbers.add(7);
        allNumbers.add(2);
        allNumbers.add(82);
        allNumbers.add(112);
        allNumbers.add(23);
        allNumbers.add(17);
        allNumbers.add(28);
        allNumbers.add(188);
        allNumbers.add(131);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List expectedResult = List.of(24, 34, 2, 82, 112, 28, 188);

        //When
        oddNumbersExterminator.exterminate(allNumbers);
        List<Integer> result = oddNumbersExterminator.getEvenNumbers();
        System.out.println(result);
        System.out.println(expectedResult);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("When an empty collection of integer numbers is given the all odd numbers are exterminated ")
    @Test

    void testOddNumbersExterminatorEmptyList() {

        //Given
        List<Integer> allEmpty = new ArrayList<>();
        OddNumbersExterminator oddEmptyExterminator = new OddNumbersExterminator();
        List expectedResult = List.of();

        //When
        oddEmptyExterminator.exterminate(allEmpty);
        List<Integer> result = oddEmptyExterminator.getEvenNumbers();
        System.out.println(result);
        System.out.println(expectedResult);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
