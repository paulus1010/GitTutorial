package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    List<Integer> evenNumbers = new ArrayList<>();

    public List<Integer> exterminate(List<Integer> numbers) {
        int tempValue = 0;
        int k = numbers.size();
        for ( int n = 0; n < k; n++) {
             tempValue = numbers.get(n);
            if (tempValue % 2 == 0) {
                evenNumbers.add(tempValue);
            }
        }
        return evenNumbers;
    }
    public List<Integer> getEvenNumbers() {return evenNumbers;}
}
