package com.example.lamda.listToMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ListToSortedMap {

    public static void main(String[] args) {

        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "L", 80000));
        list.add(new Hosting(2, "L", 90000));
        list.add(new Hosting(3, "D", 120000));
        list.add(new Hosting(4, "A", 200000));
        list.add(new Hosting(5, "M", 1));
        list.add(new Hosting(6, "L", 100000));

        listToMapSortedByName(list);
        listToMapSortedByWebsites(list);
    }

    private static void listToMapSortedByName(List<Hosting> list) {
        LinkedHashMap<String, Long> result1 = list.stream().sorted(Comparator.comparing(Hosting::getName).reversed())
                .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites, // key = name, value = websites
                        (oldValue, newValue) -> oldValue, // if same key, take the old key
                        LinkedHashMap::new // returns a LinkedHashMap, keep order
                ));

        System.out.println("Result 1 : " + result1);
    }

    private static void listToMapSortedByWebsites(List<Hosting> list) {
        LinkedHashMap<String, Long> result2 = list.stream()
                .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
                .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites, // key = name, value = websites
                        (oldValue, newValue) -> oldValue, // if same key, take the old key
                        LinkedHashMap::new // returns a LinkedHashMap, keep order
                ));

        System.out.println("Result 2 : " + result2);
    }
}
