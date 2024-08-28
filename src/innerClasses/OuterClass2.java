package innerClasses;

// Example 2: Static Inner Class
public class OuterClass2 {

        private static int staticOuterField = 20;

        static class StaticInnerClass {
            void display() {
                System.out.println(STR."StaticOuterField value: \{staticOuterField}");
            }
        }
    }

