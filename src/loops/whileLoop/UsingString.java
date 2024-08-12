package loops.whileLoop;

public class UsingString {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four", "five"};
        int i = 0;
        while (i < strings.length) {
            System.out.println("str is: " + strings[i]);
            i++;
        }
    }
}
