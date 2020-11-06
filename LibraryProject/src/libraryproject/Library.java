package libraryproject;

public class Library {

    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    public void printAvailableBooks(Book[] books) {
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b.toString());
            }
        }
    }

    public String printBookDetails(Book[] books, String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                System.out.println("right");
                return b.toString();
            }
        }
        System.out.println("wrong");
        return "Error no book found with this title.";

    }

    public void printBooksFromAuthor(Book[] books, Author author) {
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println(b.toString());
            }
        }
    }

    public Book printTheMostPopularBook(Book[] books) {
        int max = 0;
        int maxpointer = 0;
        int pointer = 0;
        for (Book b : books) {
            if (max < b.getTimesRented()) {
                max = b.getTimesRented();
                maxpointer = pointer;
            }
            pointer++;
        }

        return books[maxpointer];
    }

}
