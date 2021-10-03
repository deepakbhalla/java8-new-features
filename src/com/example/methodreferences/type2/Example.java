package com.example.methodreferences.type2;

import java.util.function.BiFunction;

/**
 * Method reference to a static method of a class
 */
public class Example {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
		Integer result = product.apply(10, 5);
		System.out.println(result);
	}
}
