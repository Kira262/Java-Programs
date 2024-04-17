import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int bookId;
    private String bookName;
    private String author;
    private int quantity;

    public Book(int bookId, String bookName, String author, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
    }
}

class User {
    private int userId;
    private String userName;
    ArrayList<Book> booksIssued;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.booksIssued = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void issueBook(Book book) {
        booksIssued.add(book);
    }

    public void returnBook(Book book) {
        booksIssued.remove(book);
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
        System.out.println("Books Issued:");
        for (Book book : booksIssued) {
            System.out.println("- " + book.getBookName());
        }
    }
}

class Library {
    ArrayList<Book> books;
    ArrayList<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void displayAllBooks() {
        System.out.println("\nAll Books in the Library:");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }

    public void displayAllUsers() {
        System.out.println("\nAll Users in the Library:");
        for (User user : users) {
            user.displayUserDetails();
            System.out.println();
        }
    }

    public void issueBook(User user, Book book) {
        if (books.contains(book) && book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() - 1);
            user.issueBook(book);
            System.out.println(book.getBookName() + " issued to " + user.getUserName());
        } else {
            System.out.println("Book is not available for issue.");
        }
    }

    public void returnBook(User user, Book book) {
        if (user.booksIssued.contains(book)) {
            book.setQuantity(book.getQuantity() + 1);
            user.returnBook(book);
            System.out.println(book.getBookName() + " returned by " + user.getUserName());
        } else {
            System.out.println("This book is not issued by the user.");
        }
    }

    public void displayBooksIssuedByUser(User user) {
        System.out.println("\nBooks Issued by " + user.getUserName() + ":");
        user.displayUserDetails();
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding some books to the library
        library.addBook(new Book(1, "Book1", "Author1", 5));
        library.addBook(new Book(2, "Book2", "Author2", 3));
        library.addBook(new Book(3, "Book3", "Author3", 7));

        // Adding some users to the library
        library.addUser(new User(101, "User1"));
        library.addUser(new User(102, "User2"));
        library.addUser(new User(103, "User3"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add User");
            System.out.println("4. Remove User");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Users");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Display Books Issued by User");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(library, scanner);
                    break;
                case 2:
                    removeBook(library, scanner);
                    break;
                case 3:
                    addUser(library, scanner);
                    break;
                case 4:
                    removeUser(library, scanner);
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
                case 6:
                    library.displayAllUsers();
                    break;
                case 7:
                    issueBook(library, scanner);
                    break;
                case 8:
                    returnBook(library, scanner);
                    break;
                case 9:
                    displayBooksIssuedByUser(library, scanner);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }
        }
    }

    private static void addBook(Library library, Scanner scanner) {
        System.out.println("\nAdding Book");
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Book book = new Book(bookId, bookName, author, quantity);
        library.addBook(book);
        System.out.println("Book added successfully!");
    }

    private static void removeBook(Library library, Scanner scanner) {
        System.out.println("\nRemoving Book");
        System.out.print("Enter book ID to remove: ");
        int bookId = scanner.nextInt();

        for (Book book : library.books) {
            if (book.getBookId() == bookId) {
                library.removeBook(book);
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    private static void addUser(Library library, Scanner scanner) {
        System.out.println("\nAdding User");
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();

        User user = new User(userId, userName);
        library.addUser(user);
        System.out.println("User added successfully!");
    }

    private static void removeUser(Library library, Scanner scanner) {
        System.out.println("\nRemoving User");
        System.out.print("Enter user ID to remove: ");
        int userId = scanner.nextInt();

        for (User user : library.users) {
            if (user.getUserId() == userId) {
                library.removeUser(user);
                System.out.println("User removed successfully!");
                return;
            }
        }
        System.out.println("User not found!");
    }

    private static void issueBook(Library library, Scanner scanner) {
        System.out.println("\nIssuing Book");
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();

        User user = getUserById(library, userId);
        Book book = getBookById(library, bookId);

        if (user != null && book != null) {
            library.issueBook(user, book);
        } else {
            System.out.println("User or Book not found!");
        }
    }

    private static void returnBook(Library library, Scanner scanner) {
        System.out.println("\nReturning Book");
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();

        User user = getUserById(library, userId);
        Book book = getBookById(library, bookId);

        if (user != null && book != null) {
            library.returnBook(user, book);
        } else {
            System.out.println("User or Book not found!");
        }
    }

    private static void displayBooksIssuedByUser(Library library, Scanner scanner) {
        System.out.println("\nDisplaying Books Issued by User");
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();

        User user = getUserById(library, userId);

        if (user != null) {
            library.displayBooksIssuedByUser(user);
        } else {
            System.out.println("User not found!");
        }
    }

    private static User getUserById(Library library, int userId) {
        for (User user : library.users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    private static Book getBookById(Library library, int bookId) {
        for (Book book : library.books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
