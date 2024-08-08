package loops.doWhile;

public class UsingDouble {
    public static void main(String[] args) {
        double d = 0.0;
        do {
            System.out.println("d is: " + d);
            d += 0.5;
        } while (d < 2.5);
    }
}
