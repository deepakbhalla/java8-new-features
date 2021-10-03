package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D");

        /** stream filter */
        System.out.println("----- Stream Filter -----");
        List<String> collect = list.stream().filter(e -> !"B".equalsIgnoreCase(e)).collect(Collectors.toList());
        collect.forEach(System.out::println);

        /** stream findAny orElse */
        System.out.println("----- Stream findAny orElse -----");

        Predicate<String> predicate = x -> !"B".equalsIgnoreCase(x);
        Predicate<String> predicate1 = x -> !"C".equalsIgnoreCase(x);

        System.out.println(list.stream().filter(predicate.negate()).findAny().orElse(null));
        System.out.println(list.stream().filter(predicate1.negate()).findAny().orElse(null));
    }
}
