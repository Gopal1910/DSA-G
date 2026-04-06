import java.util.LinkedList;

public class LinkedListUsingCollections {

    public static void main(String[] args) {

        // -------------------------------
        // Create LinkedList (Integer type)
        // -------------------------------
        LinkedList<Integer> ll = new LinkedList<>();

        // -------------------------------
        // Add elements
        // -------------------------------

        ll.add(10);          // add at end
        ll.addFirst(5);      // add at beginning
        ll.addLast(20);      // add at end
        ll.add(1, 7);        // add at index

        System.out.println("Linked List: " + ll);

        // -------------------------------
        // Remove elements
        // -------------------------------

        ll.removeFirst();    // remove first element
        ll.removeLast();     // remove last element
        ll.remove(1);        // remove element at index 1

        System.out.println("After Removal: " + ll);

        // -------------------------------
        // Search element
        // -------------------------------

        System.out.println("Contains 10? " + ll.contains(10));

        // -------------------------------
        // Size of LinkedList
        // -------------------------------

        System.out.println("Size: " + ll.size());

        // -------------------------------
        // Access elements
        // -------------------------------

        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());
    }
}
