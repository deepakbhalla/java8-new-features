package com.example.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    
    public static void main(String[] args) {
        
        Stream<String> stream = Stream.of("java", "c++", ".net", "python", null);
        List<String> list = stream.collect(Collectors.toList());
        // System.out.println(list);
        // or
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }

}
