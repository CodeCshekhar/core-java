package string;

public class Intern {
    public static void main(String[] args) {
            String s = new String("Sachin");
            String s2 = s.intern();
            System.out.println(s2); // Output: Sachin
        }
    }


