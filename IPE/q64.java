class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

class PowerCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PowerCalculator <x> <y>");
            return;
        }

        int x, y;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            if (x < 0 || y < 0) {
                throw new InvalidValueException("Both x and y must be non-negative integers.");
            }
            int result = computePower(x, y);
            System.out.println(x + "^" + y + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please provide integer values for x and y.");
        } catch (InvalidValueException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            System.out.println("Program execution complete.");
        }
    }

    // Method to compute power using repetitive multiplication
    public static int computePower(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
