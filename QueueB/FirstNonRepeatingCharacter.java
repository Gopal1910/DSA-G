import java.util.*;

/*
 * FIRST NON-REPEATING CHARACTER IN STREAM
 * --------------------------------------
 * Uses:
 * - frequency array
 * - queue
 */

public class FirstNonRepeatingCharacter {

    public static void firstNonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            System.out.print(q.isEmpty() ? "-1 " : q.peek() + " ");
        }
    }

    public static void main(String[] args) {
        firstNonRepeating("aabccxb");
    }
}
