class Coordinate {
    private double x;
    private double y;
    private double z;

    // Constructor
    public Coordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to display coordinates
    public void display() {
        System.out.println("Coordinate: (" + x + ", " + y + ", " + z + ")");
    }

    // Method to add coordinates
    public static Coordinate addCoordinates(Coordinate c1, Coordinate c2, Coordinate c3) throws Exception {
        double xSum = c1.x + c2.x + c3.x;
        double ySum = c1.y + c2.y + c3.y;
        double zSum = c1.z + c2.z + c3.z;

        // Check if the resultant coordinates are zero
        if (xSum == 0 && ySum == 0 && zSum == 0) {
            throw new Exception("Resultant coordinates are zero");
        }

        return new Coordinate(xSum, ySum, zSum);
    }

    // Main method
    public static void main(String[] args) {
        // Create three Coordinate objects
        Coordinate c1 = new Coordinate(1, 2, 3);
        Coordinate c2 = new Coordinate(4, 5, 6);
        Coordinate c3 = new Coordinate(7, 8, 9);

        try {
            // Add the coordinates
            Coordinate result = Coordinate.addCoordinates(c1, c2, c3);
            // Display the resultant coordinates
            result.display();
        } catch (Exception e) {
            // Handle exception
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
