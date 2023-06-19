package com.angeltm.hashmap;

import java.util.HashMap;

public class HashmapsI {
    public static void ex() {
        HashMap<String,Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 665489741);
        phonebook.put("Angel", 662489741);
        phonebook.put("persona", 663489741);
        phonebook.put("persona2", 665444741);
        phonebook.put("persona2", 665442221);
        phonebook.put(null, 000);
        if (phonebook.containsKey("kevin")) {
            phonebook.remove("kevin");
        }
        phonebook.clear();
        System.out.println(phonebook);
    }
}
