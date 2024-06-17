package exceptionHandling.types;

public class arithmeticException {
    public static void main(String[] args) {
        try{
            //Assigning the values
            int a = 10;
            int b = 0;

            //Checking the possibility of division
            int c = a/b;
            System.out.println("Result = "+ c);

        }catch (ArithmeticException arithmeticException){
            System.out.println("Can't Divide bye Zero");
        }
    }
}
