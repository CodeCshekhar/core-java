public class StarPattern4 {
    public static void main(String[] args) {
        int size = 7; // The size of the triangle's base

        for (int row = 1; row <= size; row++) {
            int dotsInRow = (row * 2) - 1; // Calculate the number of dots in the current row
            int spaces = (size - dotsInRow) / 2; // Calculate the number of spaces before and after the dots

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int d = 1; d <= dotsInRow; d++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
