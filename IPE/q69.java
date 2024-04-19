import java.util.ArrayList;
import java.util.List;

class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void displayPublication() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Book Title: " + title);
        super.displayPublication();
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Paper Title: " + title);
        super.displayPublication();
    }
}

class PublicationDemo {
    public static void main(String[] args) {
        List<Book> publications = new ArrayList<>();

        // Parsing command line arguments and adding publications to the list
        for (int i = 0; i < args.length; i += 3) {
            String authorName = args[i];
            String publicationType = args[i + 1];
            String title = args[i + 2];

            if (publicationType.equalsIgnoreCase("book")) {
                publications.add(new BookPublication(authorName, title));
            } else if (publicationType.equalsIgnoreCase("paper")) {
                publications.add(new PaperPublication(authorName, title));
            }
        }

        // Displaying all publications
        System.out.println("Publications:");
        for (Book publication : publications) {
            publication.displayPublication();
            System.out.println();
        }
    }
}
