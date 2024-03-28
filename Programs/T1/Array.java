// WAP to find number of even numbers & odd numbers given in array.
// Take min 10 elements in the array.
public class Array {
    public static void main(String[] args) {
        int a[]={2,5,4,8,5,9,7,6,3,1};
        int odd=0;
        int even=0;
        for(int i=0;i<a.length;i++){
            if (a[i] % 2 == 0) 
                even++; 
            else
                odd++; 
            }
            System.out.println("Even Number is: "+even);
            System.out.println("Odd Number is: "+odd);
    }
}
