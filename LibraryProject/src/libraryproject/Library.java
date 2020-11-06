package libraryproject;

public class Library {

    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    public void printAvailableBooks() {
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b.toString());
            }
        }
    }

    public String printBookDetails(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {

                return b.toString();
            }
        }

        return "Error no book found with this title.";

    }

    public void printBooksFromAuthor(Author author) {
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println(b.toString());
            }
        }
    }

    public Book printTheMostPopularBook() {
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
