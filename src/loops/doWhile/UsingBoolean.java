package loops.doWhile;

public class UsingBoolean {
    public static void main(String[] args) {
        boolean flag = false;
        int count = 0;
        do {
            System.out.println("flag is: " + flag);
            flag = !flag;
            count++;
        } while (count < 2);
    }
}
