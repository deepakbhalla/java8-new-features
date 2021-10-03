package com.example.lamda.foreach;

import java.util.HashMap;
import java.util.Map;

public class LoopAMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", null);
        map.put(null, 70);

        System.out.println("** Normal way of looping a map *");
        /** Normal way of loop */
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\n** Java 8 way of looping a map *");
        /** Java 8 way of loop */
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        System.out.println("\n** Java 8 way of looping a map without null key *");
        /** Java 8 way of looping a map */
        map.forEach((k, v) -> {
            if (k != null)
                System.out.println("Key: " + k + ", Value: " + v);
        });

        System.out.println("\n** Java 8 way of looping a map without null key and value *");
        /** Java 8 way of loop */
        map.forEach((k, v) -> {
            if (k != null && v != null)
                System.out.println("Key: " + k + ", Value: " + v);
        });
    }
}
