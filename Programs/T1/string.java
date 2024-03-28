public class string {
    public static void main(String[] args) {
        String name1 = "Hello";
        String name2 = new String("HHII");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.length());
        System.out.println(name1.charAt(1));
        System.out.println(name1.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println("HEL:" + name2.trim());
        char[] arr = name2.toCharArray();
        System.out.println(arr[0]);
        System.out.println(name2.isEmpty());
        System.out.println(name1.startsWith("He"));
        System.out.println(name2.endsWith("i"));
        System.out.println(name2.compareTo(name1));
    }
}
