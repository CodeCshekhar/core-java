import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Armstrong number: ");
        // to take input number
        int num = sc.nextInt();
        // copying the input to variable named copy
        int copy = num;
        String n = Integer.toString(num);
        int len = n.length();
        while(num != 0) {
            int rem = num % 10;
            int mul = 1;
            for(int i = 1; i <= len; i++) {
                mul *= rem;
            }
            sum += mul;
            num /= 10;
        }
        if(sum == copy) {
            System.out.println(copy + " is an Armstrong number");
        } else {
            System.out.println(copy + " is not an Armstrong number");
        }
    }

}
