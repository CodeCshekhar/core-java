package string;

public class ToCharArray {
    static String str = "Hello";
    static char[] charArray = str.toCharArray(); // Returns ['H', 'e', 'l', 'l', 'o']

    public static void main(String[] args) {
        System.out.println(charArray);
    }
}
