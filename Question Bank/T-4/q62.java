import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class CoffeeShopQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();

        boolean quit = false;
        while (!quit) {
            System.out.println("\nCoffee Shop Queue Management");
            System.out.println("1. Add a new customer to the back of the queue");
            System.out.println("2. Serve the next customer in the queue");
            System.out.println("3. View the current queue of customers");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new customer: ");
                    String newCustomer = scanner.nextLine();
                    queue.offer(newCustomer);
                    System.out.println(newCustomer + " has been added to the queue.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        String servedCustomer = queue.poll();
                        System.out.println(servedCustomer + " has been served and removed from the queue.");
                    } else {
                        System.out.println("Queue is empty. No customer to serve.");
                    }
                    break;
                case 3:
                    System.out.println("Current queue of customers:");
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        for (String customer : queue) {
                            System.out.println(customer);
                        }
                    }
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Coffee Shop Queue Management. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }

        scanner.close();
    }
}
