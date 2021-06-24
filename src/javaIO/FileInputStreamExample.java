package javaIO;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream input =
                    new FileInputStream("./textFileExample.txt");
            int i= 0;
            while((i=input.read())!= -1){
                System.out.print((char)i);
            }

            input.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
