package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamFilterNullValuesInList {

    public static void main(String[] args) {
        
        List<String> input = Arrays.asList("A", "B", "C", null, "D");
        System.out.println(input.stream().filter(Objects::nonNull).collect(Collectors.toList()));
    }
}
