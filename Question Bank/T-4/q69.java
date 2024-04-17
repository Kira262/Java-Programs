import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StockPriceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> stockPrices = new HashMap<>();

        // Read in stock prices for each date
        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter stock prices for each day (Date Price):");
        for (int i = 0; i < numDays; i++) {
            System.out.print("Date: ");
            String date = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            stockPrices.put(date, price);
        }

        // Calculate average price
        double total = 0;
        for (double price : stockPrices.values()) {
            total += price;
        }
        double averagePrice = total / stockPrices.size();

        // Output average price
        System.out.println("Average stock price for the entire period: " + averagePrice);

        scanner.close();
    }
}
