package libraryproject;

public class Librarian {
    
    private Library library;
    
    Librarian(Library library) {
        this.library = library;
    }
    
    public void findMeBooksFromAuthor(Author author) {
        library.printBooksFromAuthor(author);
    }
    
    public void findMeAvailableBooks() {
        library.printAvailableBooks();
    }
    
    public void findMeBook(String title) {
        System.out.println(library.printBookDetails(title));
    }
    
    public void findMostPopularBook() {
        System.out.println(library.printTheMostPopularBook());
    }
    
    public boolean rentBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailableCopies(book.getAvailableCopies() - 1);
            book.setTimesRented(book.getTimesRented() + 1);
            return true;
        }
        return false;
    }
    
}
