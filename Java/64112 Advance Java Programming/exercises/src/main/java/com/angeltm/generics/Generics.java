package com.angeltm.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void ex() {
        List<Character> charList = arrayToList(charArray, new ArrayList<Character>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<Boolean>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<Integer>());
        System.out.println(intList.get(0));
        throw new Error();
    }
}
