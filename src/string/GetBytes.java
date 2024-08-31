package string;

public class GetBytes {
    static String str = "Hello";
    static byte[] byteArray = str.getBytes(); // Returns byte array representation

    public static void main(String[] args) {
        System.out.println(byteArray);
    }
}
