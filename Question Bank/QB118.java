
// WAP to perform addition, multiplication, subtraction and division according to user choice using else if ladder.
import java.util.Scanner;

public class QB118 {
  @SuppressWarnings("resource")
  public static void main(String args[]) {
    int first, second, add, subtract, multiply;
    float divide;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = sc.nextInt();
    second = sc.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    divide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + divide);
  }
}