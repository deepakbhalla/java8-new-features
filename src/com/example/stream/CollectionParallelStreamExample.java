package com.example.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class CollectionParallelStreamExample {

    public static void main(String[] args) {

        System.out.println("----- normal -----");
        Instant start = Instant.now();
        getData().stream().forEach(System.out::println);
        Instant end = Instant.now();
        System.out.println("Time taken: " + Duration.between(start, end).toMillis() + " Milliseconds");

        System.out.println("----- parallel -----");
        Instant start1 = Instant.now();
        getData().parallelStream().forEachOrdered(System.out::println);
        Instant end1 = Instant.now();
        System.out.println("Time taken: " + Duration.between(start1, end1).toMillis() + " Milliseconds");
    }

    private static List<String> getData() {

        List<String> alpha = new ArrayList<>();

        int n = 97; // 97 = a , 122 = z
        while (n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }
        return alpha;
    }
}
