import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;

    private static String genre;
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

    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + bookCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the genre for all books: ");
        genre = scanner.nextLine();

        Book book1 = createBook(scanner, 1);
        Book book2 = createBook(scanner, 2);
        Book book3 = createBook(scanner, 3);

        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();

        Book.displayTotalBooks();

        scanner.close();
    }

    public static Book createBook(Scanner scanner, int bookNumber) {
        System.out.println("Enter details for Book " + bookNumber + ":");
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        scanner.nextLine();

        return new Book(title, author, year);
    }
}
