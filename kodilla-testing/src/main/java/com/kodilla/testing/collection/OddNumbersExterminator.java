package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> evenNumberList = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                evenNumberList.add(n);
            }
        }

        return evenNumberList;
    }
}
