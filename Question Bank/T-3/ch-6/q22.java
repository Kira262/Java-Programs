public class q22 {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            // Attempt to access a method or field on a null object reference
            String str = null;
            int length = str.length(); // This line will throw NullPointerException
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            // Catch and handle NullPointerException
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
