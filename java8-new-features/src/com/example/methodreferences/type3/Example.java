package com.example.methodreferences.type3;

import java.util.Arrays;

/**
 * Method reference to an instance method of an arbitrary object of a particular type
 */
public class Example {

	public static void main(String[] args) {
		String[] array = { "b", "c", "A", "D" };
		Arrays.sort(array, String::compareToIgnoreCase);
		
		StringBuilder sb = new StringBuilder();
		Arrays.asList(array).stream().forEach(a -> sb.append(a + " "));
		
		System.out.println(sb.toString());
	}
}
