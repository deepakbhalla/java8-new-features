package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAList {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("A", "B", "C", "D", "D", "E", "D");
        System.out.println(input.stream()/**.peek(System.out::println)*/.collect(Collectors.toSet()));
    }

}
