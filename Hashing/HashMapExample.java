import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        // HashMap → stores KEY → VALUE pairs
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Gopal");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        // Duplicate key → value replaced
        map.put(101, "Karan");

        System.out.println("Map: " + map);

        // get() → fetch value using key
        System.out.println("Get 102: " + map.get(102));

        // containsKey() → check key exists
        System.out.println("Contains key 103? " + map.containsKey(103));

        // Traversal using entrySet()
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
