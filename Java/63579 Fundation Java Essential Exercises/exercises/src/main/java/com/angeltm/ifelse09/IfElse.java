package com.angeltm.ifelse09;

public class IfElse {
    public static void ex() {

        int monthNumber = 4;
        if (monthNumber >= 0 && monthNumber <= 2) {
            System.out.println("You're in Quarter 1!");
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("You're in Quarter 2!");
        } else {
            System.out.println("it's the second half of the year!");
        }
    
    }
}
