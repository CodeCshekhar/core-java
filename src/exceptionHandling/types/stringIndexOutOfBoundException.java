package exceptionHandling.types;

public class stringIndexOutOfBoundException {
    public static void main(String[] args) {
        try{

            String s = "This is  what i am typing ";

            //Checking the character position
            char c = s.charAt(50);
            System.out.println(c);

        }catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println("String out of bound");
        }
    }
}
