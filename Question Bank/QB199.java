// Assume that you want to make the sum of 1 to 100. 
// Give the necessary code to perform the same using 
// (1) For loop (2) While loop (3) Do-while loop.
public class QB199 {
    public static void main(String[] args) {
        int i;
        int sum;
        sum=0;
        i = 1;
        // For Loop Case!!
        for(i=1;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        // While Loop!!
        while (i <= 100) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        // Do-while Loop!!
        do {
            sum=sum+i;
            i++;
        } while (i<=100);
        System.out.println(sum);
    }
}
