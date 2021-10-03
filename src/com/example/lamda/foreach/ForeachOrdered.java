package com.example.lamda.foreach;

import java.util.stream.Stream;

public class ForeachOrdered {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");

        // s.parallel().forEach(e -> System.out.println(e));
        // System.out.println(System.lineSeparator());
        s.parallel().forEachOrdered(e -> System.out.println(e));
    }

}
