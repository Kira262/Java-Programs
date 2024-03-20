public class stringbuffer {
    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(9);
        StringBuffer sb3 = new StringBuffer("Hello");
        System.out.println("sb1: " + sb1.capacity());
        System.out.println("sb2: " + sb2.capacity());
        System.out.println("sb3: " + sb3.capacity());
        System.out.println("sb3 charAt: " + sb3.charAt(0));
        System.out.println("sb3 reverse: " + sb3.reverse());
        System.out.println("sb3: " + sb3);
        System.out.println("sb3 append: " + sb3.append("Hi"));
        System.out.println("sb3: " + sb3);
        StringBuffer sb4 = new StringBuffer("Hello");
        System.out.println("sb4 insert: " + sb4.insert(2, "Hi"));
        StringBuffer sb5 = new StringBuffer("Hello");
        System.out.println("sb5 replace: " + sb5.replace(1, 3, "Hi"));
        StringBuffer sb6 = new StringBuffer("Hello");
        System.out.println("sb6 delete: " + sb6.delete(1, 4));
    }
}