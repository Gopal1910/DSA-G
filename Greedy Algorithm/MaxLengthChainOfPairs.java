import java.util.*;

public class MaxLengthChainOfPairs {

    // Max Length Chain of Pairs

    public static void main(String[] args) {

        int pairs[][] = {
            {5, 24},
            {39, 60},
            {5, 28},
            {27, 40},
            {50, 90}
        };

        // Sort pairs by second element
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int count = 1;
        int lastEnd = pairs[0][1];

        // Greedy selection
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                count++;
                lastEnd = pairs[i][1];
            }
        }

        System.out.println("Maximum chain length = " + count);
    }
}
