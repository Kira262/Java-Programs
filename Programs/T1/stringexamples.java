import java.util.Arrays;

public class stringexamples {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String result = str1.concat(str2);
        System.out.println(result);
        String str3 = "Hello,How,Are,You";
        String[] XYZ = str3.split(",");
        System.out.println(XYZ[0]);
        String n1 = "Hello World";
        System.out.println(n1.indexOf('e'));
        System.out.println(n1.indexOf("World"));
        int[] numbers = { 1, 2, 3, 4, 5 };
        String xyz = Arrays.toString(numbers);
        System.out.println(xyz);
    }
}
