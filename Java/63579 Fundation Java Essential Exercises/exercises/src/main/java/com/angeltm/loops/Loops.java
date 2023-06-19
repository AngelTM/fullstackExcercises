package com.angeltm.loops;

public class Loops {
    private static String[] months =
            {"January", "February", "March",
                    "April", "May", "June",
                    "July", "August", "September",
                    "October", "November", "December"};
    public static void ex() {
        
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);            
        }
        
        for (String month : months) {
            System.out.println(month);
        }
        
        int counter =0;
        while (counter<months.length) {
            System.out.println(months[counter]);
            counter++;
        }

        counter = 0;
        do {
            System.out.println(months[counter]);
            counter ++;

            if (counter == 5) {
                break;
            }

        } while (counter < months.length);
    }
}
