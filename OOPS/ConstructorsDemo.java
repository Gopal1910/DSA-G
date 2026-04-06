import java.util.*;

// Constructors example
public class ConstructorsDemo {
    public static void main(String[] args) {

        Student s1 = new Student();          // default
        Student s2 = new Student("Gopal");   // parameterized
        Student s3 = new Student(s2);        // copy

        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}

class Student {
    String name;

    // Default constructor
    Student() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(String name) {
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
    }
}
