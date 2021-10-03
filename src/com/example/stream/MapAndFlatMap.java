package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("A1", "B1", "D1", "B1");
        names.stream().map(String::toLowerCase).forEach(System.out::println);

        List<List<String>> namesList = Arrays.asList(
                Arrays.asList("A1", "B1", "D1", "B1"),
                Arrays.asList("A2", "B2", "D2", "B2"));

        List<String> collect = namesList.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
