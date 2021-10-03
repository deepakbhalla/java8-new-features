package com.example.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToStringArray {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("A", "B");
        String[] array = stream.map(String::toUpperCase).toArray(String[]::new);
        Arrays.asList(array).stream().forEach(System.out::println);
    }
}
