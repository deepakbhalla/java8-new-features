package com.example.lamda.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoopAList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(null);
        list.add("E");

        /** looping a list using lambda expression */
        list.stream().forEach(l -> System.out.println(l));
        System.out.println(System.lineSeparator());

        /** looping a list using method reference */
        list.stream().forEach(System.out::println);

        System.out.println(System.lineSeparator());
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }
}
