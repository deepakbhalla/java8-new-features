package com.example.stream;

import java.util.stream.Stream;

public class FibonacciExample {

    public static void main(String[] args) {

        printFibonacci(10);
        System.out.println(sumOfFibanocci(10));
    }

    private static void printFibonacci(int i) {
        Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] })
            .mapToInt(n -> n[0])
            .limit(10)
            .forEach(System.out::println);
    }

    private static int sumOfFibanocci(int i) {

        return Stream.iterate(new int[] {0, 1}, n -> new int[] {n[1], n[0] + n[1]})
            .mapToInt(n -> n[0])
            .limit(10)
            .sum();
    }
}
