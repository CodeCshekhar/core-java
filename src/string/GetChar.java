package string;

public class GetChar {
    static String str = "Hello World";
    static char[] charArray = new char[5];

    public static void main(String[] args) {
        str.getChars(0, 5, charArray, 0);// Copies "Hello" into charArray
        System.out.println(charArray);
    }
}
