package com.example.methodreferences.type1;

/**
 * Method reference to an instance method of an object
 */
public class Example {

	public void print() {
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		
		Example ob = new Example();
		MyFunctionInterface ref = ob::print;
		ref.display();
	}
}
