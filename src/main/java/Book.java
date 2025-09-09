import java.lang.reflect.Array;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author + ", " + this.pages + " pages.";
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 250);
        Book book2 = new Book("The Lord of The Rings", "J.R.R. Tolkein", 1_000);
        Book book3 = new Book("The Count of Monte Cristo", "Alexandre Dumas", 1_200);

        Book[] books = new Book[]{book1, book2, book3};

        for (Book book: books) {
            System.out.println(book.toString());
        }
    }
}
