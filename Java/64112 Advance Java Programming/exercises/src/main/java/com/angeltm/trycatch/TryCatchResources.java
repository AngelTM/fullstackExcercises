package com.angeltm.trycatch;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

public class TryCatchResources {
    public static void Ex() {
        
        try (BufferedReader reader = new BufferedReader(new StringReader("hello World"));
            StringWriter writer = new StringWriter();
        ) {
            writer.write(reader.readLine());
            System.out.println(writer.toString());
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        

    }
}
