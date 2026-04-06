import java.util.*;

public class IndianCoins {

    // Indian Coins (Greedy)

    public static void main(String[] args) {

        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        // Sort in descending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 590;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Greedy coin selection
        for (int coin : coins) {
            while (coin <= amount) {
                amount -= coin;
                count++;
                ans.add(coin);
            }
        }

        System.out.println("Minimum coins = " + count);
        System.out.println("Coins used = " + ans);
    }
}
