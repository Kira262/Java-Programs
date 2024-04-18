import java.util.Hashtable;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.io.*;

public class PhoneDirectory {
    Scanner sc = new Scanner(System.in);
    Hashtable<String, String> phonebook;
    ArrayDeque<String> callingHistory;
    ArrayDeque<String> operationHistory;
    String fileName = "phone_directory.txt";
    String callingFileName = "CallingHistory.txt";

    PhoneDirectory() {
        phonebook = new Hashtable<>();
        callingHistory = new ArrayDeque<>();
        operationHistory = new ArrayDeque<>();
        try {
            FileWriter fw2 = new FileWriter(callingFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addContact() {
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter Phone Number:");
        String phone = sc.next();
        phonebook.put(name, phone);
        System.out.println("Contact added successfully");
        operationHistory.addFirst("Add:" + name);
    }

    void removeContact() {
        System.out.println("Enter name you want to remove:");
        String name = sc.next();
        if (phonebook.containsKey(name)) {
            phonebook.remove(name);
            System.out.println("Contact removed successfully");
            operationHistory.addFirst("Remove:" + name);
        } else {
            System.out.println("Contact not found");
        }
    }

    void searchContact() {
        System.out.println("Enter name you want to search:");
        String name = sc.next();
        String phone = phonebook.get(name);
        if (phone != null) {
            System.out.println("Phone number: " + phone);
            operationHistory.addFirst("Search:" + name);
        } else {
            System.out.println("Contact not found");
        }
    }

    void displayAllContacts() {
        if (phonebook.isEmpty()) {
            System.out.println("Phone book is empty");
        } else {
            for (String name : phonebook.keySet()) {
                System.out.println("Name: " + name + ", Phone Number: " + phonebook.get(name));
            }
            operationHistory.addFirst("Display All contacts");
        }
    }

    void renameContact() {
        System.out.println("Enter a name you want to rename:");
        String oldName = sc.next();
        if (phonebook.containsKey(oldName)) {
            System.out.println("Enter new name:");
            String newName = sc.next();
            phonebook.put(newName, phonebook.remove(oldName));
            System.out.println("Rename successful");
            operationHistory.addFirst("Rename:" + oldName + " to " + newName);
        } else {
            System.out.println("Contact not found");
        }
    }

    void callContact() {
        System.out.println("Enter name you want to call:");
        String name = sc.next();
        String phone = phonebook.get(name);
        if (phone != null) {
            System.out.println("Calling: " + name);
            callingHistory.addFirst(name);
            operationHistory.addFirst("Call:" + name);
        } else {
            System.out.println("Contact not found");
        }
    }

    void savePhoneDirectoryToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (String name : phonebook.keySet()) {
                bw.write(name + "," + phonebook.get(name));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void loadPhoneDirectoryFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    phonebook.put(parts[0], parts[1]);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void saveCallingHistoryToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(callingFileName));
            for (String called : callingHistory) {
                bw.write(called);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void loadCallingHistoryFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(callingFileName));
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line of calling history
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneDirectory pd = new PhoneDirectory();
        pd.loadPhoneDirectoryFromFile();
        pd.loadCallingHistoryFromFile();
        boolean b = true;
        while (b) {
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Rename Contact");
            System.out.println("6. Call Contact");
            System.out.println("7. Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    pd.addContact();
                    pd.savePhoneDirectoryToFile();
                    break;
                case 2:
                    pd.removeContact();
                    pd.savePhoneDirectoryToFile();
                    break;
                case 3:
                    pd.searchContact();
                    break;
                case 4:
                    pd.displayAllContacts();
                    break;
                case 5:
                    pd.renameContact();
                    pd.savePhoneDirectoryToFile();
                    break;
                case 6:
                    pd.callContact();
                    pd.saveCallingHistoryToFile();
                    break;
                case 7:
                    b = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
        }
        System.out.println("Recent operations:");
        for (String history : pd.operationHistory) {
            System.out.println(history);
        }
    }
}
