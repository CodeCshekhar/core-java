package exceptionHandling.types;

public class nullPointerException {
    public static void main(String[] args) {
        try{

            //Assigning the values as null....
            String s = null;
            System.out.println(s.charAt(0));

        }catch (NullPointerException nullPointerException){
            System.out.println("Null Pointer Exception");
        }
    }
}
