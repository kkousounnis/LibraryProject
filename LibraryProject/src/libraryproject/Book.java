/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

/**
 *
 * @author root
 */
public class Book {

    private String title;
    private Author author;
    private int physicalCopies;
    private final String isbn;
    private int availableCopies;
    private int timesRented;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPhysicalCopies() {
        return physicalCopies;
    }

    public void setPhysicalCopies(int physicalCopies) {
        this.physicalCopies = physicalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public int getTimesRented() {
        return timesRented;
    }

    public void setTimesRented(int timesRented) {
        this.timesRented = timesRented;
    }

    Book(String title, Author author, int physicalCopies, String isbn, int availableCopies, int timesRented) {
        this.title = title;
        this.author = author;
        this.physicalCopies = physicalCopies;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
        this.timesRented = timesRented;
    }

    public String toString() {
        return "{Author: " + author.toString() + ",Title: " + this.title + ",PhysicalCopies: " + this.physicalCopies + ",isbn: " + this.isbn + ",avalableCopies: " + this.availableCopies + "}";
    }

    public boolean isAvailable() {
        return (availableCopies > 0) ? true : false;
    }

    public boolean hasAuthor(Author name) {
        return (author.equals(name)) ? true : false;
    }

}
