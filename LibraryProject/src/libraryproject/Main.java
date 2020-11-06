/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author Theodoridis = new Author("Theodoridis");
        Author Birbou = new Author("Birbou");
        Book b1 = new Book("DataBase1", Theodoridis, 100, "1234", 1, 9);
        Book b2 = new Book("DataBase2", Theodoridis, 50, "1235", 3, 10);
        Book b3 = new Book("DataBase3", Birbou, 40, "1236", 4, 7);
        Book[] arr = {b1, b2, b3};
        
        System.out.println(b1.isAvailable());
        
        System.out.println(b1.toString());
        
        System.out.println(b1.hasAuthor(Theodoridis));
        

        Library l = new Library(arr);
        System.out.println("Prints books that have at least one available physical copy.");
        l.printAvailableBooks(arr);
        System.out.println("");
        System.out.println("Searches for a book based on a given title."
                + " If the book exists then its details should be printed,"
                + "otherwise an error message should be displayed");
        System.out.println(l.printBookDetails(arr, "DataBase1"));
        System.out.println("");
        System.out.println("Shows only the books that have an author that "
                + "matches a given name");
        //l.printBooksFromAuthor(arr, Theodoridis);
        l.printBooksFromAuthor(arr, Birbou);
        System.out.println("");
        System.out.println("Show the book with the highest number of"
                + " the timesRented");
        System.out.println(l.printTheMostPopularBook(arr));
        System.out.println("--------");
        Librarian lr = new Librarian();
        System.out.println(b3);
        lr.rentBook(b3);
        System.out.println(b3);

    }

}
