import java.util.*;

// == aur equals() ka difference
public class StringComparison {
    public static void main(String args[]) {

        String s1 = "Gopal";
        String s2 = "Gopal";
        String s3 = new String("Gopal");

        // == reference check karta hai
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // equals() value check karta hai
        System.out.println(s1.equals(s3)); // true
    }
}
