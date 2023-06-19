package com.angeltm.working_with_primitives02;

public class Primitives {

    public static void ex() {
	   byte b = 1;
       System.out.println(b);

       short s = 1;
       System.out.println(s);

       int i = 1;
       System.out.println(i);

       long l = 1;
       System.out.println(l);

       System.out.println("byte max value: "+Byte.MAX_VALUE);
       b=126;
       System.out.println("b:byte value = "+b);
       System.out.println("b incremented in 1 = "+ ++b);
       System.out.println("another 1 increment = "+ ++b);

       System.out.println("short max value: "+Short.MAX_VALUE);
       s=32766;
       System.out.println("s:short value = "+s);
       System.out.println("s incremented in 1 = "+ ++s);
       System.out.println("another 1 increment = "+ ++s);

       float f = 1f;
       double d = 1d;
       if (b < Byte.MAX_VALUE) ++b;
       System.out.println(b);
       b = 126;
       if (b < Byte.MAX_VALUE) ++b;
       System.out.println(b);
        
    }
}