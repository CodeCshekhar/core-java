package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComplexArrayListExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23));

        // Sort by age
        Collections.sort(students, Comparator.comparingInt(Student::getAge));

        // Search for a student by name
        Student searchResult = students.stream()
                .filter(s -> "Alice".equals(s.getName()))
                .findAny()
                .orElse(null);

        // Filter students older than 21
        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getAge() > 21)
                .collect(Collectors.toList());

        // Print the sorted list
        System.out.println("Sorted by age:");
        students.forEach(System.out::println);

        // Print the search result
        System.out.println("Search result for 'Alice': " + searchResult);

        // Print the filtered list
        System.out.println("Students older than 21:");
        filteredStudents.forEach(System.out::println);
    }
}

