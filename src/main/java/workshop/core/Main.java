package workshop.core;

import java.io.*;

public class Main 
{
    public static void main( String[] args )
    {
        //? Declares a variable type of string called userInput
        String userInput;
        
        //? Obtaining a reference to the console
        Console con = System.console();
        
        //? Establish a boolean condition where the default value is true
        Boolean useBookshelf = true;
        
        //? Instantiate a new bookshelf database from the class
        BookDatabase books = new BookDatabase();
        
        
        //? Reads a string and then display it
        while (useBookshelf) {
            System.out.printf("Welcome to the book database \n");
            String input = con.readLine("> ");
            String[] terms = input.split(" "); //? Split returns an array of string
            String command = terms[0];

            if (command.equals("search")) {
                userInput = con.readLine("Please enter the title of your book: ");
                books.load("books.txt");
                books.search(userInput);
            } else if (command.equals("exit")){
                useBookshelf = false;
                break;
            } else {
                System.err.println("Please enter a valid input");
            }
        }
        System.out.println("Exiting the program....");

    }
}
