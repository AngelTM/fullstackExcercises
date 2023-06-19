package com.angeltm.compareStrings06;

public class CompareStrings {
    public static void ex() {
        String s1 = "Hello!";
        String s2 = "Hello!";
        if (s1==s2) {
            System.out.println("they match");
        }else{
            System.out.println("they don't match");
        }
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        if (s3 ==s4) {
            System.out.println("they match");
        }else{
            System.out.println("they don't match");
        }
        if (s3.equals(s4)) {
            System.out.println("they match");
        }else{
            System.out.println("they don't match");
        }
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("they match");
        }else{
            System.out.println("they don't match");
        }
    }
}
