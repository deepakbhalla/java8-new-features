package com.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratePrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Prime numbers until 50: " + primeNumberUntil(50));
        System.out.println("Prime numbers between 10 and 31: " + primeNumbersInRange(10, 31));
    }

    private static List<Integer> primeNumberUntil(Integer n) {
        return IntStream.range(2, n).filter(GeneratePrimeNumbers::isPrime).boxed().collect(Collectors.toList());
    }

    private static List<Integer> primeNumbersInRange(Integer start, Integer end) {
        return IntStream.range(start, end).filter(GeneratePrimeNumbers::isPrime).boxed().collect(Collectors.toList());
    }
    
    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }
}
