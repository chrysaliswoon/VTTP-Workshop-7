package workshop.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
    //? List to hold the strings of the txt. file
    List<String> database = new ArrayList<String>();

    //? Methods

    //? Loads the txt file into an Array List
    public void load(String fileName){
        try {
            //? Load data from the file
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
    
            //? Read the entire line as a string
            String line = bf.readLine();
    
            //? Checking for the end of the file
            while (line != null) {
                database.add(line);
                line = bf.readLine();
            }
    
            //? Closing the bufferReader object
            bf.close();
    
            //? Storing the data in an arraylist to an array
            String[] array = database.toArray(new String[0]);
    
            // //? Printing each line of file which is stored in an array
            // for (String str: array) {
            //     System.out.println(str);
            // }
        } catch (IOException e) {
            e.getStackTrace();
        }
        
    }

    //? Search the list of books
    public void search(String bookTitle){
        database.forEach(books -> {
            if (books.contains(bookTitle)) {
                System.out.println(books);
            }
        });
    }
}
