public class Book {
    private String title;
    private String author;
    private int year;

    private static String genre = "Thriller";
    private static int bookCount = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }

    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

    public static void displayBookCount() {
        System.out.println("Total number of books: " + bookCount);
    }

    public static void main(String[] args) {

        Book b1 = new Book("Nemesis", "Mohammad Nazim Uddin", 2016);
        Book b2 = new Book("Contract", "Mohammad Nazim Uddin", 2017);
        Book b3 = new Book("Zoo", "Otsuichi", 2003);

        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();

        Book.displayBookCount();
    }
}

