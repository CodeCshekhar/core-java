package breakContinue;

public class NestedLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
