package string;

public class EqualsIgnore {
    static String str1 = "Hello";
    static String str2 = "hello";
    static boolean result = str1.equalsIgnoreCase(str2); // Returns true

    public static void main(String[] args) {
        System.out.println(result);
    }
}
