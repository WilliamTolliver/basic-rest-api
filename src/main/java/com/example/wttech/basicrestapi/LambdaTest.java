package com.example.wttech.basicrestapi;

public class LambdaTest {
    public static void main(String[] args) {
        Interface1 i1 = (s) -> System.out.println(s);
        i1.talk("This is a default method");


    }
}
