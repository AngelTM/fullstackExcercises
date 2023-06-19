package com.angeltm.lambdas;


public interface GreetingMessage extends interface2 {
    public default void imprimir(){
        System.out.println();
    }
    public abstract void greet(String name);
    
}
