package javaIO;


import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            File textFile = new File("./textFileExample.txt");
            FileOutputStream output = new FileOutputStream(textFile);
            String text = "Hello, Welcome to Kaliyona";
            byte b[] = text.getBytes();
            output.write(b);
            output.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
