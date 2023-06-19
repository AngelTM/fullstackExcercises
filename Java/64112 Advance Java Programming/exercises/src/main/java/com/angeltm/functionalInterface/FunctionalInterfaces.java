package com.angeltm.functionalInterface;

public class FunctionalInterfaces {
 public static void ex() {
    GreetingMessage gm = new GreetingMessage() {
        @Override
        public void greet(String name){
            System.out.println("hello "+name);
        }
    };
    gm.greet("angel");
 }   
}
