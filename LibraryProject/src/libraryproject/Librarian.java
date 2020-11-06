package libraryproject;

public class Librarian {

    private Library library;

    Librarian() {

    }

    public void findMeBooksFromAuthor(Book[] books, Author author) {
        library.printBooksFromAuthor(books, author);
    }

    public void findMeAvailableBooks(Book[] books) {
        library.printAvailableBooks(books);
    }

    public void findMeBook(Book[] books, String title) {
        library.printBookDetails(books, title);
    }

    public void findMostPopularBook(Book[] books) {
        System.out.println(library.printTheMostPopularBook(books));
    }
    public boolean rentBook(Book book){
        if(book.isAvailable()){
            System.out.println(book.getTimesRented());
            book.setTimesRented(book.getTimesRented()-1);
            System.out.println(book.getTimesRented());
            return true;
        }
        return false;
    }

}
