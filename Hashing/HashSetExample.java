import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        // HashSet → stores UNIQUE elements, no duplicates allowed
        HashSet<String> set = new HashSet<>();

        set.add("Gopal");
        set.add("Rahul");
        set.add("Amit");
        set.add("Gopal"); // duplicate ignored automatically

        System.out.println("Set: " + set);

        // size() → number of elements
        System.out.println("Size: " + set.size());

        // contains() → check element present or not
        System.out.println("Contains Rahul? " + set.contains("Rahul"));

        // remove() → delete element
        set.remove("Amit");
        System.out.println("After remove: " + set);

        // isEmpty() → check set empty or not
        System.out.println("Is Empty? " + set.isEmpty());
    }
}
