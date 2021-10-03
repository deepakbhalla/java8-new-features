package com.example.lamda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(2, "name2", 2));
        products.add(new Product(1, "name1", 1));
        products.add(new Product(3, "name3", 3));

        System.out.println("Original list of product =>");
        products.stream().forEach(product -> System.out.println(product.toString()));

        System.out.println("\nSorting on the basis of product name =>");
        Collections.sort(products, (p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });

        /** Another way or sorting a list based upon a property */
        // products.sort(Comparator.comparing(Product::getId));
        
        products.stream().forEach(product -> System.out.println(product.toString()));
    }
}
