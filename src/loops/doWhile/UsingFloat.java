package loops.doWhile;

public class UsingFloat {
    public static void main(String[] args) {
        float f = 0.0f;
        do {
            System.out.println("f is: " + f);
            f += 0.5f;
        } while (f < 2.5f);
    }
}
