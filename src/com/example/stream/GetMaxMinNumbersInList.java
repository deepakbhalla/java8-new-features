package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GetMaxMinNumbersInList {

    public static void main(String[] args) {

        List<Integer> ip = Arrays.asList(1, 45, 2, 9, 8, 100, 2);
        findMaxNumber(ip);
        findMinNumber(ip);
    }

    private static void findMaxNumber(List<Integer> ip) {
        Optional<Integer> max = ip.stream().distinct()
                /** .peek(System.out::println) */
                .max(Comparator.comparingInt(Integer::valueOf));
        if (max.isPresent()) {
            System.out.println(max.get());
        }
    }

    private static void findMinNumber(List<Integer> ip) {
        Optional<Integer> min = ip.stream().distinct().min(Comparator.comparing(Integer::valueOf));
        if (min.isPresent()) {
            System.out.println(min.get());
        }
    }
}
