package starPattern;

public class StarPattern5 {
    public static void main(String[] args) {
        int size = 7; // The size of the triangle's base

        for (int row = 1; row <= size; row++) {
            for (int space = 1; space <= (size - row); space++) {
                System.out.print(" ");
            }

            for (int dot = 1; dot <= (row * 2) - 1; dot++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
