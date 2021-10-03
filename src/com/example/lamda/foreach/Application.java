package com.example.lamda.foreach;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Iterate a list using forEach and lamda
        List<String> input = Arrays.asList("A", "B", "C", "D");
        input.stream().forEach(element -> System.out.println(element));

        // Create a thread using lamda
        Runnable r = () -> {
            System.out.println("Thread is running");
        };
        Thread th = new Thread(r);
        th.start();
    }
}
