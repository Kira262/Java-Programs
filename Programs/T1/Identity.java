// WAP to check whether the given matrix is Identity Or Not.
import java.util.Scanner;

public class Identity {
    public static void main(String[] args) {
        int r,c,n;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of raw: ");
        r = sc.nextInt();
        System.out.println("Enter size of cloumns: ");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter at I:" + i + "j:" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
            if ((i==j) && (arr[i][j]!=1))
            {
                flag=false;
                break;
            }    
            if ((i!=j)&& (arr[i][j]!=0))
            {
                flag=false;
                break;
            }
            }
        }
        if (flag==true) {
            System.out.println("Given Matrix Is Identity Matrix!!");
        }
        else
        {
            System.out.println("Not A Identity Matrix");
        }
    }
}