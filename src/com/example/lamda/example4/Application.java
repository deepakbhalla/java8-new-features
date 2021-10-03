package com.example.lamda.example4;

public class Application {

    public static void main(String[] args) {

        Sayable say = (arg1, arg2) -> "Hello " + arg1 + ", " + arg2;
        System.out.println(say.say("Deepak", "Bhalla"));

    }
}
