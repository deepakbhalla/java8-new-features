package com.example.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByCountOrSum {

    public static void main(String[] args) {

        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")), 
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")), 
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")), 
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99")));
        
        Map<String, Long> counting = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println("Count of items: " + counting);

        Map<String, Integer> sum = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println("\nSum of items: "+ sum);
        
        Map<BigDecimal, List<Item>> groupByPriceMap = items.stream().collect(Collectors.groupingBy(Item::getPrice));
        System.out.println("\nGroup by Price: " + groupByPriceMap);
        
        Map<BigDecimal, Set<String>> result = items.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println("\nItem names Group By Price: " + result);
    }

    static class Item {

        private String name;
        private int qty;
        private BigDecimal price;

        public Item(String name, int qty, BigDecimal price) {
            super();
            this.name = name;
            this.qty = qty;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getQty() {
            return qty;
        }

        public BigDecimal getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Item [name=" + name + ", qty=" + qty + ", price=" + price + "]";
        }
    }
}
