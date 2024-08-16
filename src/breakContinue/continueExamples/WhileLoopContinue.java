package breakContinue.continueExamples;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            count++;
            if (count % 3 == 0) {
                continue;
            }
            System.out.println(count);
        }
    }
}
