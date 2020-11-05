package libraryproject;

public class Library {

    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    public void printAvailableBooks(Book[] Books) {
        for (Book b : Books) {
            if (b.isAvailable()) {
                System.out.println(b.toString());
            }
        }
    }

    public String printBookDetails() {
        return "G";
    }

    public void printBooksFromAuthor() {

    }

    public int printTheMostPopularBook() {
        return 1;
    }

}
