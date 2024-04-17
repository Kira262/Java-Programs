import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class WebBrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> history = new ArrayDeque<>();
        String currentUrl = "about:blank"; // Initial URL

        boolean quit = false;
        while (!quit) {
            System.out.println("\nWeb Browser History Navigation");
            System.out.println("1. Visit a new web page");
            System.out.println("2. Navigate back");
            System.out.println("3. Navigate forward");
            System.out.println("4. View current web page");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the URL of the new web page: ");
                    String newUrl = scanner.nextLine();
                    history.addLast(currentUrl);
                    currentUrl = newUrl;
                    System.out.println("Navigated to: " + currentUrl);
                    break;
                case 2:
                    if (!history.isEmpty()) {
                        String previousUrl = history.removeLast();
                        history.addFirst(currentUrl);
                        currentUrl = previousUrl;
                        System.out.println("Navigated back to: " + currentUrl);
                    } else {
                        System.out.println("No previous web page in history.");
                    }
                    break;
                case 3:
                    if (!history.isEmpty()) {
                        String nextUrl = history.removeFirst();
                        history.addLast(currentUrl);
                        currentUrl = nextUrl;
                        System.out.println("Navigated forward to: " + currentUrl);
                    } else {
                        System.out.println("No forward web page in history.");
                    }
                    break;
                case 4:
                    System.out.println("Current web page: " + currentUrl);
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting Web Browser History Navigation. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }

        scanner.close();
    }
}
