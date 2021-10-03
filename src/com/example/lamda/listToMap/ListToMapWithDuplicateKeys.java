package com.example.lamda.listToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapWithDuplicateKeys {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "name1", 1));
        products.add(new Product(2, "name2", 2));
        products.add(new Product(3, "name3", 3));
        products.add(new Product(3, "name4", 4));

        System.out.println("List: " + products);
        System.out.println("Map: " + listToMapWithDuplicateKeyHandling(products));
    }

    private static Map<Integer, String> listToMapWithDuplicateKeyHandling(List<Product> products) {
        Map<Integer, String> map = products.stream()
                .collect(Collectors.toMap(Product::getId, Product::getName,
                        /** here user has to decide to map old value or new value if key already exists */
                        (oldValue, newValue) -> newValue));
        return map;
    }
}
