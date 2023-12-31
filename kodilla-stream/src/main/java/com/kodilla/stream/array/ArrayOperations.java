package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .mapToObj(i -> numbers[i])
                .forEach(System.out::println);

        double averageNum =  IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average()
                .getAsDouble();
        return averageNum;
    }
}
