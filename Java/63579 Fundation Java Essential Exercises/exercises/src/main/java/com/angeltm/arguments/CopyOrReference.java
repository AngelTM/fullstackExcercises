package com.angeltm.arguments;

public class CopyOrReference {
    public static void ex() {
        int original =5;
        System.out.println("original before: "+original);   
        CopyOrReference.incrementValue(original);
        System.out.println("original after: "+original);
        int[] arrOriginal ={1,2,3};
        System.out.println("original before: "+arrOriginal[0]);   
        CopyOrReference.incrementValue(original);
        System.out.println("original after: "+arrOriginal[0]);
        String originalString="original";
        System.out.println("original before: "+originalString);   
        CopyOrReference.changeString(originalString);
        System.out.println("original after: "+originalString);
    }
    
    public static void incrementValue(int inMethod){
        inMethod++;
        System.out.println("in method: "+inMethod);
    }
    public static void changeString(String inMethod){
        inMethod="NEW";
        System.out.println("in method: "+inMethod);
    }

}
