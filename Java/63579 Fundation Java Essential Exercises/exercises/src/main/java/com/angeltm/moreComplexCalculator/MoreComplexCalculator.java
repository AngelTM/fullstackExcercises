package com.angeltm.moreComplexCalculator;

import java.util.Scanner;

public class MoreComplexCalculator {
    public static void ex() {
        double v1 = MoreComplexCalculator.enterNumberValue();
        double v2 = MoreComplexCalculator.enterNumberValue();
        char op = MoreComplexCalculator.enterOperator();
        switch (op) {
            case '+':
                System.out.println("the result is: "+ MoreComplexCalculator.sum(v1, v2));
                break;
            case '-':
                System.out.println("the result is: "+ MoreComplexCalculator.sub(v1, v2));
                break;
            case '*':
                System.out.println("the result is: "+ MoreComplexCalculator.mul(v1, v2));  
                break;
            case '/':
                System.out.println("the result is: "+ MoreComplexCalculator.div(v1, v2));
                break;
            default:
                System.out.println("incorrect operator");
            break;
        }
    }

    public static double enterNumberValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        double value = sc.nextDouble();
        return value;
    }

    public static char enterOperator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a operator (+ - * /)");
        String input = sc.nextLine();
        return input.charAt(0);
    }

    public static double sum(double v1,double v2) {
        return v1+v2;
    }
    public static double sub(double v1,double v2) {
        return v1-v2;
    }
    public static double mul(double v1,double v2) {
        return v1*v2;
    }
    public static double div(double v1,double v2) {
        return (double)v1/v2;
    }
}
