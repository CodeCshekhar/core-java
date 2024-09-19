package string;

public class ReplaceAll {
    static String str = "Hello World";
    static String replaced = str.replaceAll("o", "0"); // Returns "Hell0 W0rld"

    public static void main(String[] args) {

        System.out.println(replaced);
    }
}
