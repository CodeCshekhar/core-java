package operators;

public class StringConOps {

        public static void main(String[] args) {


                    // String Concatenation Operator (+)
                    String text = "This is a ";

                    // Example 1: Concatenating with integers
                    int number = 10;
                    String concatenatedText1 = text + number;
                    System.out.println("Concatenated with integer: " + concatenatedText1);

                    // Example 2: Concatenating with floating point numbers
                    double floatingNumber = 3.14;
                    String concatenatedText2 = text + floatingNumber;
                    System.out.println("Concatenated with floating point number: " + concatenatedText2);

                    // Example 3: Concatenating with characters
                    char character = 'A';
                    String concatenatedText3 = text + character;
                    System.out.println("Concatenated with character: " + concatenatedText3);

                    // Example 4: Concatenating with booleans
                    boolean boolValue = true;
                    String concatenatedText4 = text + boolValue;
                    System.out.println("Concatenated with boolean: " + concatenatedText4);

                    // Example 5: Concatenating with other strings
                    String anotherText = "Java program.";
                    String concatenatedText5 = text + anotherText;
                    System.out.println("Concatenated with another string: " + concatenatedText5);
                }



        }





