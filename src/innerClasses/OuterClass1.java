package innerClasses;

// Example 1: Simple Inner Class
public class OuterClass1 {
    private int outerField = 10;

    class InnerClass {
        void display() {
            System.out.println(STR."OuterField value: \{outerField}");
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}