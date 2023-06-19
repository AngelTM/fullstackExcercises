package com.angeltm.lambdas;

public class Lambdas {
 public static void ex() {
    GreetingMessage gm = new GreetingMessage() {
        @Override
        public void greet(String name){
            System.out.println("hello "+name);
        }
    };
    gm.greet("angel");

    GreetingMessage gm2 = (String name)->{
        System.out.println("hello "+name);
    };
    gm2.greet("angel");
 }   
}
