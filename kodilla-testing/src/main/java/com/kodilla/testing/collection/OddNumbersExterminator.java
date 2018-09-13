package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0 && numbers.get(i) != 0){
                numbers2.add(i);
            }
        }
        return numbers2;
    }
}
