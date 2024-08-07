package loops.forLoop;

public class UsingBoolean {
    public static void main(String[] args) {
        boolean[] flags = {true, false, true, false, true};
        for (int i = 0; i < flags.length; i++) {
            System.out.println("flag is: " + flags[i]);
        }
    }
}
