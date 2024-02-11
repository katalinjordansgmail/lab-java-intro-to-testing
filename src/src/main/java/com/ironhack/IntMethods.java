package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class IntMethods {

    public int[] returnOddNumbers(int[] allNumbers) {
        List<Integer> oddNumbersList= new ArrayList<>();
        for(int num : allNumbers) {
            if (num % 2 != 0) {
                oddNumbersList.add(num);
            }
        }

        int[] oddNumbersArray = new int[oddNumbersList.size()];
        for (int i = 0; i < oddNumbersArray.length; i++) {
            oddNumbersArray[i] = oddNumbersList.get(i);
        }
        return oddNumbersArray;
    }
}
