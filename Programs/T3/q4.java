
//wap that takes arhgument from hte user and thorw custom exception_charnotFoundException when user enters any value aprt from alphabets
import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        try {
            checkAlphabets(str);
        } catch (CharNotAllowedException e) {
            System.out.println(e.getMessage());
        }
        s.close();
    }

    static void checkAlphabets(String str) throws CharNotAllowedException {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new CharNotAllowedException("Invalid str - only alphabets allowed");
            }
        }
    }
}

class CharNotAllowedException extends Exception {
    public CharNotAllowedException(String message) {
        super(message);
    }
}