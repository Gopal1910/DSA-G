import java.util.*;

// Buy and Sell Stock – Max Profit
public class BuyAndSellStocks {

    public static int buyAndSellStocks(int prices[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){

            // agar selling price zyada hai
            if(prices[i] > buyPrice){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // naya minimum buy price
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit = " + buyAndSellStocks(prices));
    }
}
