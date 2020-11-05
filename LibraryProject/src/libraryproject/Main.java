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
        Book b1 = new Book("DataBase1", Theodoridis, 100, "1234", 1, 2);
        Book b2 = new Book("DataBase2", Theodoridis, 50, "1235", 3, 2);
        Book[] arr = {b1,b2};
        System.out.println(b1.isAvailable());
        System.out.println(b1.toString());
        System.out.println(b1.hasAuthor(Theodoridis));
        
        Library l = new Library(arr);
        l.printAvailableBooks(arr);

    }

}
