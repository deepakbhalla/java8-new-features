package com.example.lamda.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(2, "name2", 2));
        products.add(new Product(1, "name1", 1));
        products.add(new Product(3, "name3", 3));

        // Collect products having id greater than 1
        List<Product> collect = products.stream().filter(p -> (p.getId() > 1)).collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}
