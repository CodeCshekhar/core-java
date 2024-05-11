package StarPattern;

public class StarPattern3 {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to increase or decrease the size of the triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
