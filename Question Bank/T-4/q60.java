import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a); // Max heap

        // Take input from the user
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            priorityQueue.offer(scanner.nextInt());
        }

        // Display the top three highest integers
        System.out.println("Top three highest integers:");
        for (int i = 0; i < 3; i++) {
            if (!priorityQueue.isEmpty()) {
                System.out.println(priorityQueue.poll());
            } else {
                System.out.println("PriorityQueue is empty.");
                break;
            }
        }

        scanner.close();
    }
}
