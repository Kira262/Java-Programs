// WAP that reads number from 1 to 7 and accordingly it should print MONDAY to SUNDAY by using Switch statement.
import java.util.Scanner;
public class QB137 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  
    int dayNum;
    System.out.print("Enter a day number (1-7): ");
    dayNum = in.nextInt();
    switch(dayNum) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        System.out.println("TGIF!");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;       
      default:
        System.out.println("Invalid day number.");
        break;                      
    } 
  }
}