import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hashtable<String, Book> library = new Hashtable<>();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book");
            System.out.println("4. List all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    removeBook(scanner, library);
                    break;
                case 3:
                    searchBook(scanner, library);
                    break;
                case 4:
                    listBooks(library);
                    break;
                case 5:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }

    private static void addBook(Scanner scanner, Hashtable<String, Book> library) {
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.print("Enter the publisher of the book: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter the year of publication of the book: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Book book = new Book(title, author, publisher, year);
        library.put(title, book);
        System.out.println("Book added to the library.");
    }

    private static void removeBook(Scanner scanner, Hashtable<String, Book> library) {
        System.out.print("Enter the title of the book to remove: ");
        String title = scanner.nextLine();

        if (library.containsKey(title)) {
            library.remove(title);
            System.out.println("Book removed from the library.");
        } else {
            System.out.println("Book '" + title + "' not found in the library.");
        }
    }

    private static void searchBook(Scanner scanner, Hashtable<String, Book> library) {
        System.out.print("Enter the title of the book to search for: ");
        String title = scanner.nextLine();

        Book book = library.get(title);
        if (book != null) {
            System.out.println("Book found in the library:");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publisher: " + book.getPublisher());
            System.out.println("Year of Publication: " + book.getYear());
        } else {
            System.out.println("Book '" + title + "' not found in the library.");
        }
    }

    private static void listBooks(Hashtable<String, Book> library) {
        System.out.println("Books in the library:");
        Set<String> titles = library.keySet();
        for (String title : titles) {
            Book book = library.get(title);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publisher: " + book.getPublisher());
            System.out.println("Year of Publication: " + book.getYear());
            System.out.println();
        }
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }
}
