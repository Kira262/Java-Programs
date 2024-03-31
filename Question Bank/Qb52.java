public class Qb52 {

    // Compare two integers
    public int compare(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
            return 1;
        }
    }

    // Compare two characters
    public int compare(char a, char b) {
        return Character.compare(a, b);
    }

    // Compare two doubles
    public int compare(double a, double b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Qb52 comparison = new Qb52();

        // Integer comparison
        System.out.println("Integer comparison:");
        System.out.println("Compare(5, 3): " + comparison.compare(5, 3));
        System.out.println("Compare(3, 5): " + comparison.compare(3, 5));
        System.out.println("Compare(5, 5): " + comparison.compare(5, 5));

        // Character comparison
        System.out.println("\nCharacter comparison:");
        System.out.println("Compare('a', 'b'): " + comparison.compare('a', 'b'));
        System.out.println("Compare('b', 'a'): " + comparison.compare('b', 'a'));
        System.out.println("Compare('a', 'a'): " + comparison.compare('a', 'a'));

        // Double comparison
        System.out.println("\nDouble comparison:");
        System.out.println("Compare(5.5, 3.2): " + comparison.compare(5.5, 3.2));
        System.out.println("Compare(3.2, 5.5): " + comparison.compare(3.2, 5.5));
        System.out.println("Compare(5.5, 5.5): " + comparison.compare(5.5, 5.5));
    }
}
