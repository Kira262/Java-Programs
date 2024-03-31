import java.util.Scanner;

class Account {
    private int accountId;
    private String name;
    private double balance;

    // Constructor
    public Account(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    // Method to assign values
    public void assignValues(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Balance: $" + balance);
    }

    // Method to search for account number
    public boolean searchAccount(int searchId) {
        return this.accountId == searchId;
    }
}

public class Qb65 {
    public static void main(String[] args) {
        // Create an array of Account objects
        Account[] accounts = new Account[5];

        // Initialize account objects
        accounts[0] = new Account(101, "John", 1000.0);
        accounts[1] = new Account(102, "Alice", 1500.0);
        accounts[2] = new Account(103, "Bob", 2000.0);
        accounts[3] = new Account(104, "Eve", 2500.0);
        accounts[4] = new Account(105, "Charlie", 3000.0);

        // Print details of all accounts
        System.out.println("Details of all accounts:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\nAccount " + (i + 1) + ":");
            accounts[i].displayValues();
        }

        // Search for an account
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the account ID to search: ");
        int searchId = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].searchAccount(searchId)) {
                System.out.println("\nAccount found!");
                System.out.println("Account Details:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nAccount not found!");
        }
        scanner.close();
    }
}
