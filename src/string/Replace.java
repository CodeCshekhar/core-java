package string;

public class Replace {
    static String str = "Hello World";
    static String replaced = str.replace('o', '0'); // Returns "Hell0 W0rld"

    public static void main(String[] args) {
        System.out.println(replaced);
    }
}
