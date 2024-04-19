class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class NegativeNumber {
    public static void main(String[] args) {
        try {
            checkForNegativeNumbers(args);
            System.out.println("All numbers are non-negative.");
        } catch (NegativeNumberException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

    // Method to check for negative numbers in command-line arguments
    public static void checkForNegativeNumbers(String[] args) throws NegativeNumberException {
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num < 0) {
                throw new NegativeNumberException("Negative number found: " + num);
            }
        }
    }
}
