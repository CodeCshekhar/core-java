package exceptionHandling.tryCatch;

public class inMethods {
    public static void main(String[] args) {
        try {
                method1();
        } catch (Exception e) {
                System.out.println("Caught in main: " + e.getMessage());
            }


    }public static void method1() throws Exception {
        try {
                method2();
        } catch (Exception e) {
                System.out.println("Caught in method1: " + e.getMessage());
                throw e; // re-throwing the exception
        }


    }public static void method2() throws Exception {
            throw new Exception("Exception thrown from method2");
    }
}


