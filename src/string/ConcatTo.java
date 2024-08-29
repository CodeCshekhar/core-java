package string;

public class ConcatTo {
    static String str1 = "Hello";
    static String str2 = "World";
    static String result = str1.concat(" ").concat(str2); // Returns "Hello World"

    public static void main(String[] args) {
        System.out.println(result);
    }
}

