package com.angeltm.implementingLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapI {
    public static void ex() {
        LinkedHashMap<String,Integer> phonebook = new LinkedHashMap<>(4,0.75f,false);
        phonebook.put("Kevin", 665489741);
        phonebook.put("Angel", 662489741);
        phonebook.put("persona", 663489741);
        phonebook.put("persona2", 665444741);
        phonebook.put("persona2", 665442221);
        phonebook.put(null, 000);
        System.out.println("kevin phone number is"+phonebook.get("Kevin"));
        for (Map.Entry<String,Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
