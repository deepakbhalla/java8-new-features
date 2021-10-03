package com.example.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaticMethodReference {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3", "4");

        // lamda expression
        System.out.println("--- lamda expression ----");
        list.forEach(e -> SimplePrinter.print(e));

        // method reference
        System.out.println("\n--- method reference ----");
        list.forEach(SimplePrinter::print);
        
        // Convert list of String to list of Integer
        System.out.println("\n--- Convert list of String to list of Integer ----");
        list.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
    }

    static class SimplePrinter {
        public static void print(String str) {
            System.out.println(str);
        }
    }
}
