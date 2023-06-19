package com.angeltm.simpleCalculator08;

import java.util.Scanner;

public class SimpleCalculator {
    public static void ex() {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a numeric value: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter a numeric value: ");
        double n2 = sc.nextDouble();
        double result = n1 +n2;
        System.out.println("the result is "+ result);
    }
}
