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

        Author theodoridis = new Author("Theodoridis");
        Author birbou = new Author("Birbou");
        Author kotzanikolaou = new Author("kotzanikolaou");
        Author psarakis = new Author("Psarakis");
        Author alepis = new Author("Alepis");
        Author patsakis = new Author("Patsakis");
        Author sapounakis = new Author("Sapounakis");
        Author skondras = new Author("Skondras");

        Book b1 = new Book("Book1", alepis, "368777540-2", 10, 2, 20);
        Book b2 = new Book("Book2", patsakis, "963099898-2", 10, 1, 22);
        Book b3 = new Book("Book3", theodoridis, "005382097-2", 10, 0, 23);
        Book b4 = new Book("Book4", psarakis, "538310208-2", 10, 3, 24);
        Book b5 = new Book("Book5", alepis, "562448132-2", 10, 4, 26);
        Book b6 = new Book("Book6", kotzanikolaou, "670364563-2", 10, 2, 21);
        Book b7 = new Book("Book7", patsakis, "466916869-2", 10, 5, 17);
        Book b8 = new Book("Book8", psarakis, "764674973-2", 10, 0, 15);
        Book b9 = new Book("Book9", sapounakis, "052469721-2", 10, 6, 17);
        Book b10 = new Book("Book10", psarakis, "609291817-2", 10, 3, 13);
        Book b11 = new Book("Book11", theodoridis, "451378028-2", 10, 8, 12);
        Book b12 = new Book("Book12", kotzanikolaou, "142352773-2", 10, 6, 20);
        Book b13 = new Book("Book13", theodoridis, "115135166-2", 10, 0, 20);
        Book b14 = new Book("Book14", kotzanikolaou, "631942468-2", 10, 3, 20);
        Book b15 = new Book("Book15", theodoridis, "323662444-2", 10, 0, 23);
        Book b16 = new Book("Book16", skondras, "121360492-2", 10, 0, 12);
        Book b17 = new Book("Book17", kotzanikolaou, "391199302-2", 10, 0, 20);
        Book b18 = new Book("Book18", alepis, "549307784-2", 10, 1, 20);
        Book b19 = new Book("Book19", kotzanikolaou, "368777230-2", 10, 23, 20);
        Book b20 = new Book("Book20", skondras, "793027213-2", 10, 0, 20);

        Book[] books = {b1, b2, b3, b4, b5, b6, b7,
            b8, b9, b10, b11, b12, b13, b14, b15,
            b16, b17, b18, b19, b20};

        Library library = new Library(books);

        Librarian lr = new Librarian(library);
        lr.findMeAvailableBooks();
        lr.findMeBook("kotzanikolaou");
        lr.findMostPopularBook();
        System.out.println("");
        System.out.println(b19);
        if (lr.rentBook(b19)) {
            System.out.println("Successful renting\n"+b19);
        } else {
            System.out.println("The book is not available");
        }

    }

}
