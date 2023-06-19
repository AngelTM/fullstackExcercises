package org.example;

import java.util.Scanner;
public class Exceptions
{
    public static void main(String[] args)
    {
            int val, sum=0;
            Scanner scan = new Scanner(System.in);
            String line;
            System.out.println("Enter a line of text");
            Scanner scanLine = new Scanner(scan.nextLine());
            while (scanLine.hasNext())
            {
                try{
                    val = Integer.parseInt(scanLine.next());
                    sum += val;
                }
                catch(Exception ex){

                   // ex.printStackTrace();
                    System.out.println("You are using letters and you can only  must use numbers try again");
                    System.out.println("YOu error was: "+ ex);

                }
            }
            System.out.println("The sum of the integers on this line is " + sum);


    }
}
