import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 9);   // add at index

        System.out.println(list);
        System.out.println(list.get(2)); // get
        list.remove(2);                 // remove
        list.set(1, 10);                // set
        System.out.println(list.contains(1));
        System.out.println(list.size());
    }
}
