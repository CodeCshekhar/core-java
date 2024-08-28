package innerClasses;

// Example 3: Method Local Inner Class
public class OuterClass3 {
    private int outerField = 30;

    public void someMethod() {
        final int localVariable = 40;

        class MethodLocalInnerClass {
            void display() {
                System.out.println(STR."OuterField value: \{outerField}");
                System.out.println(STR."LocalVariable value: \{localVariable}");
            }
        }
        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.display();
    }
}
