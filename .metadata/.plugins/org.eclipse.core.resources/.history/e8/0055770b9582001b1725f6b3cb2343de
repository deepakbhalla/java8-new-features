package com.example.lamda.example1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		
		/** 
		 * Example 1 : Function Interface
		 * Output: Hello, Engineer
		 */
		MyFunctionalInterface msg = (name) -> {
			return "Hello, " + name;
		};
		
		System.out.println(msg.message("Engineer"));
		
		/**
		 * Example 2 : Use forEach() and lamda expression to iterate a list
		 * Output: 1 2 3 4 5 
		 */
		/**  */
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		StringBuilder sb = new StringBuilder();
		list.stream().forEach(a -> sb.append(a + " "));
		System.out.println(sb.toString());
		
		/**
		 * Example 3 : Use forEach() and lamda expression to iterate a Map
		 * Output:
		 * Fruit: Apple, Price: 50
		 * Fruit: Grapes, Price: 40
		 * Fruit: Papaya, Price: 50
		 * Fruit: Orange, Price: 20
		 * Fruit: Banana, Price: 10
		 */
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);
		prices.forEach((k, v) -> System.out.println("Fruit: " + k  + ", Price: " + v));
	}
}
