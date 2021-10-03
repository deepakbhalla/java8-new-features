package com.example.lamda.listToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapNoDuplicates {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "name1", 1));
        products.add(new Product(2, "name2", 2));
        products.add(new Product(3, "name3", 3));

        System.out.println("List: " + products);
        System.out.println("Map: " + listToMap(products));
    }

    private static Map<Integer, String> listToMap(List<Product> products) {
        Map<Integer, String> map = products.stream().collect(Collectors.toMap(Product::getId, Product::getName));
        return map;
    }
}
