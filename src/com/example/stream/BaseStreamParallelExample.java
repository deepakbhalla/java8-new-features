package com.example.stream;

import java.util.stream.IntStream;

public class BaseStreamParallelExample {

    public static void main(String[] args) {

        System.out.println("-- normal loop --");
        sequentialLoop();

        System.out.println("-- parallel loop --");
        parallelUnOrderedLoop();

        System.out.println("-- parallel ordered loop --");
        parallelOrderedLoop();
    }

    private static void parallelOrderedLoop() {
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEachOrdered(System.out::println);
    }

    private static void parallelUnOrderedLoop() {
        IntStream range1 = IntStream.rangeClosed(1, 10);
        range1.parallel().forEach(System.out::println);
    }

    private static void sequentialLoop() {
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);
    }
}
