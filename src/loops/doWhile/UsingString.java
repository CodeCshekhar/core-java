package loops.doWhile;

public class UsingString {
    public static void main(String[] args) {
        String str = "a";
        do {
            System.out.println("str is: " + str);
            str = str + "a";
        } while (str.length() < 5);
    }
}
