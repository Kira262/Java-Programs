import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Restaurant {
    Queue<String> cookQueue = new ArrayDeque<>();

    public void order(String itemName) {
        cookQueue.offer(itemName);
        System.out.println(itemName + " added to the cook queue.");
    }

    public void takeFood() {
        if (!cookQueue.isEmpty()) {
            String itemReady = cookQueue.poll();
            System.out.println("Order ready: " + itemReady);
        } else {
            System.out.println("Cook queue is empty. No order to take.");
        }
    }

    public void viewQueue() {
        if (!cookQueue.isEmpty()) {
            System.out.println("Cook queue items: " + cookQueue);
        } else {
            System.out.println("Cook queue is empty.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        while (!quit) {
            System.out.println("\nRestaurant Menu");
            System.out.println("1. Order");
            System.out.println("2. Take Food");
            System.out.println("3. View Cook Queue");
            System.out.println("4. Exit Restaurant");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the item to order: ");
                    String itemName = scanner.nextLine();
                    restaurant.order(itemName);
                    break;
                case 2:
                    restaurant.takeFood();
                    break;
                case 3:
                    restaurant.viewQueue();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Restaurant. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }

        scanner.close();
    }
}
