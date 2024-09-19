package string;

public class Split {
    static String str = "Apple,Banana,Cherry";
    static String[] fruits = str.split(","); // Returns ["Apple", "Banana", "Cherry"]

    public static void main(String[] args) {
        System.out.println(fruits);
    }
}
