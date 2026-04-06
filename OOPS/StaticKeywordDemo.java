import java.util.*;

// Static keyword example
public class StaticKeywordDemo {
    public static void main(String[] args) {

        Student.schoolName = "JMV";

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
    }
}

class Student {
    static String schoolName; // shared by all objects
}
