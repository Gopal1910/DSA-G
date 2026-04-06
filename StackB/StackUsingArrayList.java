import java.util.*;

/*
 * STACK IMPLEMENTATION USING ARRAYLIST
 * -----------------------------------
 * - Stack follows LIFO (Last In First Out)
 * - ArrayList ka last element stack ka TOP hota hai
 * - push / pop / peek -> O(1)
 */

public class StackUsingArrayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // check if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push element at top
        public static void push(int data) {
            list.add(data);
        }

        // pop element from top
        public static int pop() {
            if (isEmpty()) return -1;
            return list.remove(list.size() - 1);
        }

        // return top element
        public static int peek() {
            if (isEmpty()) return -1;
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        // popping elements
        while (!Stack.isEmpty()) {
            System.out.println(Stack.pop());
        }
    }
}
