package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        int[] counter = new int[26];
        char[] lettersArray = new char[word.length()];
        lettersArray = word.toUpperCase().toCharArray();
        try{
            for (int i=0; i < word.length(); i++)
                counter[lettersArray[i]-'A']++;
        }catch (IndexOutOfBoundsException e){

        }


        for (int i=0; i < counter.length; i++)
            if (counter[i] != 0)
                System.out.println((char)(i +'A') + ": " + counter[i]);

    }
}