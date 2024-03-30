// Declare a class called coordinate to represent 3 dimensional Cartesian coordinates(x, y, and z) define following method.
//  - Initialize Method
//  - Display method to print values of members
//  - Add_coordinates method, to add three such coordinates object to produce a resultant coordinates object. 
//  - Main , to show use of above method

public class QB92 {
    private int x, y, z;

    public QB92(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public QB92 add_cords(QB92 c1, QB92 c2) {
        int x_sum = this.x + c1.x + c2.x;
        int y_sum = this.y + c1.y + c2.y;
        int z_sum = this.z + c1.z + c2.z;

        return new QB92(x_sum, y_sum, z_sum);
    }

    public static void main(String[] args) {
        QB92 c1 = new QB92(1, 2, 3);
        QB92 c2 = new QB92(4, 5, 6);
        QB92 c3 = new QB92(7, 8, 9);

        c1.display(); 
        c2.display(); 
        c3.display(); 

        QB92 result = c3.add_cords(c1, c2);
        result.display(); 
    }
}