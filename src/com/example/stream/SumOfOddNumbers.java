package com.example.stream;

import java.util.stream.Stream;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        System.out.println(sumOfOddNumber(20));
    }

    private static long sumOfOddNumber(int i) {
        return Stream.iterate(0, n -> n + 1)
                .filter(n -> n % 2 != 0)
                .limit(i)
                // .peek(System.out::println) // for debugging purpose
                .mapToInt(n -> n)
                .sum();
    }

}
