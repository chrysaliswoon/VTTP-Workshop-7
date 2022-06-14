package workshop.core;

import java.io.FileInputStream;
import java.io.InputStream;

public class Sessions {


    //? Program to load Text File as InputStream
    public void load(String fileName) {
        try {
            //? File txt is loaded as input stream
            InputStream input = new FileInputStream(fileName);
            System.out.println("Book Database: ");

            //? Reads the first byte
            int i = input.read();
            while (i != -1) {
                System.out.print((char)i);

                //? Reads the next byte from the file
                i = input.read();
            }
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
