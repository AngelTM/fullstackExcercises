import java.io.*;

class FileRead {
    public static void readFile(String fileName) throws IOException{
        FileInputStream file = new FileInputStream(fileName);
        int data;
        while((data = file.read()) != -1){
            System.out.print((char)data);
        }
        file.close();
    }
}

public class Solution {
    public static void main(String[] args) {
        try {
            FileRead.readFile("sample.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e);
        }
    }
}