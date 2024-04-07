// Parent class Book
class Book {
    private String authorName;

    // Constructor
    public Book(String authorName) {
        this.authorName = authorName;
    }

    // Method to display publication details
    void displayPublication() {
        System.out.println("Author: " + authorName);
    }
}

// Subclass BookPublication
class BookPublication extends Book {
    private String title;

    // Constructor
    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    // Method to display publication details
    @Override
    void displayPublication() {
        super.displayPublication();
        System.out.println("Title: " + title);
        System.out.println("Type: Book");
    }
}

// Subclass PaperPublication
class PaperPublication extends Book {
    private String title;

    // Constructor
    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    // Method to display publication details
    @Override
    void displayPublication() {
        super.displayPublication();
        System.out.println("Title: " + title);
        System.out.println("Type: Paper");
    }
}

// Main class
public class q3 {
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length < 4) {
            System.out.println("Usage: java Main <author_name> <title1> <title2> <type1> <type2>");
            return;
        }

        String authorName = args[0];
        String title1 = args[1];
        String title2 = args[2];
        String type1 = args[3];
        String type2 = args[4];

        // Creating objects of BookPublication and PaperPublication
        Book book1 = null;
        Book book2 = null;

        if (type1.equalsIgnoreCase("book")) {
            book1 = new BookPublication(authorName, title1);
        } else if (type1.equalsIgnoreCase("paper")) {
            book1 = new PaperPublication(authorName, title1);
        }

        if (type2.equalsIgnoreCase("book")) {
            book2 = new BookPublication(authorName, title2);
        } else if (type2.equalsIgnoreCase("paper")) {
            book2 = new PaperPublication(authorName, title2);
        }

        // Displaying publication details
        if (book1 != null) {
            book1.displayPublication();
        }

        if (book2 != null) {
            book2.displayPublication();
        }
    }
}
