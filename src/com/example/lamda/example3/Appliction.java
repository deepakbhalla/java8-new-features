package com.example.lamda.example3;

public class Appliction {

    public static void main(String[] args) {

        Sayable say = (message) -> "Hello " + message;
        System.out.println(say.say("Deepak"));
    }
}
