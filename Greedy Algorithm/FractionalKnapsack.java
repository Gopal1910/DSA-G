import java.util.*;

public class FractionalKnapsack {

    // Fractional Knapsack (Greedy)

    public static void main(String[] args) {

        int value[]  = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        // ratio[i][0] = index
        // ratio[i][1] = value / weight
        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        // Sort by descending ratio
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        double maxValue = 0;
        int capacity = W;

        // Greedy selection
        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                maxValue += value[idx];
            } else {
                maxValue += ratio[i][1] * capacity;
                break;
            }
        }

        System.out.println("Maximum value = " + maxValue);
    }
}
