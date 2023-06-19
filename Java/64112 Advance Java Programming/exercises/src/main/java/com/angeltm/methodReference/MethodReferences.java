package com.angeltm.methodReference;

public class MethodReferences {
    public static void ex() {

            Square s = new Square(4);
    
            Shapes shapes = Square::calculateArea;
    
            System.out.println("Area: " + shapes.getArea(s));
    
      
    }
}
