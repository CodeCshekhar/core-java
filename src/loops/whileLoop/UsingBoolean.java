package loops.whileLoop;

public class UsingBoolean {
    public static void main(String[] args) {
        boolean[] flags = {true, false, true, false, true};
        int i = 0;
        while (i < flags.length) {
            System.out.println("flag is: " + flags[i]);
            i++;
        }
    }
}
