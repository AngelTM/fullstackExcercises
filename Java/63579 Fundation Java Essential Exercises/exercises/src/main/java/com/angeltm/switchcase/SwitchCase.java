package com.angeltm.switchcase;

public class SwitchCase {
    public static void ex() {
        int month = 1;

        switch (month) {
            case 0:
                    //System.out.println("It's January!");
                    //break;
            case 1:
                    //System.out.println("It's February!");
                    //break;
            case 2:
                System.out.println("It's Quarter 1!");
                break;
            default:
                System.out.println("It's some other month!");
        }

        String monthName = "February";
        switch (monthName) {
            case "January":
                System.out.println("It's the first month.");
                break;
            default:
                System.out.println("It isn't January");
        }
    }
}
