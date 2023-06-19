package com.angeltm.javaOperators05;

public class Operators {
    public static void ex() {
        char c1='1';
        System.out.println(c1);
        char c2 ='2';
        System.out.println(c2);
        char c3 ='3';
        System.out.println(c3);
        char nine = '\u0039';
        System.out.println(nine);
        char dollar ='\u0024';
        System.out.println(dollar);
        char a ='a';
        System.out.println(a);
        char upper = Character.toUpperCase(a);
        System.out.println(upper);
        char[] chars = {'a','b','1','2'};
        for (char c : chars) {
            System.out.println(c);
        }
        String s = new String(chars);
        System.out.println(s);
        System.out.println(s.toCharArray());
    }
}
