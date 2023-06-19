package com.angeltm.booleanAndCharacter04;

public class BooleanAndCharacters {

    public static void ex() {
   
        boolean b1 = true;
        System.out.println(b1);
        boolean b2 = false;
        System.out.println(b2);
        boolean b3 = false;
        System.out.println(b3);
        boolean reversed = !b3;
        System.out.println(reversed);
        reversed = !reversed;
        System.out.println(reversed);
        int i=0;
        System.out.println(i);
        boolean b4 = i!=0;
        System.out.println(b4);
        boolean b5 = Boolean.parseBoolean("true");
        System.out.println(b5);
        b5 = Boolean.parseBoolean("asd");
        System.out.println(b5);

        
        

    }
}