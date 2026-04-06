import java.util.*;

/*
 * STOCK SPAN PROBLEM
 * -----------------
 * Span = number of consecutive days price <= today
 * Uses stack of INDEXES
 * Time Complexity: O(n)
 */

public class StockSpanProblem {

    public static void stockSpan(int[] stocks, int[] span) {

        Stack<Integer> s = new Stack<>();

        span[0] = 1; // first day
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {

            // pop smaller prices
            while (!s.isEmpty() && stocks[i] >= stocks[s.peek()]) {
                s.pop();
            }

            span[i] = s.isEmpty() ? i + 1 : i - s.peek();
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];

        stockSpan(stocks, span);

        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}
