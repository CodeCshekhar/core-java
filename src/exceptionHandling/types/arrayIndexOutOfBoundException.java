package exceptionHandling.types;


import java.util.Arrays;

public class arrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try{
            //Making an Array
            int i []= new int[5];
            i[5] = 9;
            System.out.println(Arrays.toString(i));

        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Out of bound Index ");
        }
    }
}
