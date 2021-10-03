package com.example.stream;

import java.util.Arrays;

public class StreamToIntegerArray {

    public static void main(String[] args) {

        int[] input = { 1, 2, 3, 4, 5 };
        Integer[] array = Arrays.stream(input).map(n -> n).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.asList(array));
    }
}
