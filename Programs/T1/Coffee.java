import java.util.*;

public class Coffee {
    public static void main(String[] args) {
        System.out.println("--------------Menu-----------------\n 1-Espresso\n 2-Cappuccino \n 3-Latte");
        Scanner a = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int n = a.nextInt();
        switch (n) {
            case 1:
                System.out.println("Thank you for ordering espresso");
                Scanner qu1 = new Scanner(System.in);
                System.out.print("Enter size (200 or 400): ");
                int size1 = qu1.nextInt();
                switch (size1) {
                    case 200:
                        System.out.println("You selected Espresso and quantity is 200ml");
                        System.out.print("Enter quantity: ");
                        int quantity1 = qu1.nextInt();
                        System.out.println(quantity1 * 100 + " is price.");
                        break;
                    case 400:
                        System.out.println("You selected Espresso and quantity is 400ml");
                        System.out.print("Enter quantity: ");
                        int quantity2 = qu1.nextInt();
                        System.out.println(quantity2 * 200 + " is price.");
                        break;
                    default:
                        System.out.println("Wrong quantity");
                }
                System.out.println("Thank You For Visiting Us!!");
                break;
            case 2:
                System.out.println("Thank you for ordering cappuccino");
                Scanner qu2 = new Scanner(System.in);
                System.out.print("Enter size (200 or 400): ");
                int size2 = qu2.nextInt();
                switch (size2) {
                    case 200:
                        System.out.println("You selected cappuccino and quantity is 200ml");
                        System.out.print("Enter quantity: ");
                        int quantity3 = qu2.nextInt();
                        System.out.println(quantity3 * 150 + " is price.");
                        break;
                    case 400:
                        System.out.println("You selected cappuccino and quantity is 400ml");
                        System.out.print("Enter quantity: ");
                        int quantity4 = qu2.nextInt();
                        System.out.println(quantity4 * 250 + " is price.");
                        break;
                    default:
                        System.out.println("Wrong quantity");
                }
                System.out.println("Thank You For Visiting Us!!");
                break;
            case 3:
                System.out.println("Thank you for ordering latte");
                Scanner qu3 = new Scanner(System.in);
                System.out.print("Enter size (200 or 400): ");
                int size3 = qu3.nextInt();
                switch (size3) {
                    case 200:
                        System.out.println("You selected latte and quantity is 200ml");
                        System.out.print("Enter quantity: ");
                        int quantity5 = qu3.nextInt();
                        System.out.println(quantity5 * 200 + " is price.");
                        break;
                    case 400:
                        System.out.println("You selected latte and quantity is 400ml");
                        System.out.print("Enter quantity: ");
                        int quantity6 = qu3.nextInt();
                        System.out.println(quantity6 * 300 + " is price.");
                        break;
                    default:
                        System.out.println("Wrong quantity");
                }
                System.out.println("Thank You For Visiting Us!!");
                break;
            default:
                System.out.println("Only Offers Values From 1 to 3");
        }
    }
}
