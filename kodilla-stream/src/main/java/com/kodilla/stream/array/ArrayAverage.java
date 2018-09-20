package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class ArrayAverage implements ArrayOperations {
    private final int[] numbers;

    public ArrayAverage(int[] numbers) {
        this.numbers = numbers;
    }
    public double getAverage(int [] numbers) {
            IntStream.range(0, numbers.length)
                    .mapToDouble(n->numbers[n])
                    .forEach(System.out::println);

            return IntStream.range(0,numbers.length)
                    .mapToDouble(n->numbers[n])
                    .average()
                    .orElse(0.0); //jak average wyswietlic w konsoli
    }
}
