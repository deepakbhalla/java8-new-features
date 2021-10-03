package com.example.lamda.example2;

public class Application {

	public static void main(String[] args) {
		
		Sayable say = () -> "Nothing to say";
		
		System.out.println(say.say());
	}
}
