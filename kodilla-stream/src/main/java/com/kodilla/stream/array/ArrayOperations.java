package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .mapToDouble(n -> numbers[n])
                .map(k -> {
                    System.out.println(k);
                    return k;
                })
                .average().getAsDouble();
    }
}