import java.util.*;

public class ChocolaProblem {

    // Chocola Problem (Greedy)

    public static void main(String[] args) {

        int vertical[] = {2, 1, 3, 1, 4};     // x costs
        int horizontal[] = {4, 1, 2};        // y costs

        // Sort costs in ascending order
        Arrays.sort(vertical);
        Arrays.sort(horizontal);

        int v = vertical.length - 1;
        int h = horizontal.length - 1;

        int verticalPieces = 1;
        int horizontalPieces = 1;
        int cost = 0;

        // Greedy selection
        while (v >= 0 && h >= 0) {
            if (vertical[v] > horizontal[h]) {
                cost += vertical[v] * horizontalPieces;
                verticalPieces++;
                v--;
            } else {
                cost += horizontal[h] * verticalPieces;
                horizontalPieces++;
                h--;
            }
        }

        // Remaining vertical cuts
        while (v >= 0) {
            cost += vertical[v] * horizontalPieces;
            v--;
        }

        // Remaining horizontal cuts
        while (h >= 0) {
            cost += horizontal[h] * verticalPieces;
            h--;
        }

        System.out.println("Minimum cost = " + cost);
    }
}
