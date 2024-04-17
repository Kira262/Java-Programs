import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        // Read names and corresponding phone numbers from the user
        System.out.print("Enter the number of entries: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter names and corresponding phone numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Prompt the user for a name and output the corresponding phone number
        System.out.print("Enter a name to search for: ");
        String nameToSearch = scanner.nextLine();
        String phoneNumber = phoneBook.get(nameToSearch);
        if (phoneNumber != null) {
            System.out.println("Phone number for " + nameToSearch + ": " + phoneNumber);
        } else {
            System.out.println("No phone number found for " + nameToSearch);
        }

        scanner.close();
    }
}
