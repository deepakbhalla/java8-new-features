package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SquareNumbersFilterAndAverage {

    public static void main(String[] args) {
        
        List<Integer> ip = Arrays.asList(100, 100, 9, 8, 200);
        OptionalDouble result = ip.stream()
                .mapToInt(n -> n * n)
                /**.peek(System.out::println)*/
                .filter(n -> n > 100)
                .average();
        System.out.println(result);
    }
}
