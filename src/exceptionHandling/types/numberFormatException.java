package exceptionHandling.types;

public class numberFormatException {
    public static void main(String[] args) {

        try{
            //Java is not number
            int i = Integer.parseInt("Java");

        }catch (NumberFormatException numberFormatException) {
            System.out.println("The given input is not a number");
        }
    }
}
