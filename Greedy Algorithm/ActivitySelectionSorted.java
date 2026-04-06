import java.util.*;

public class ActivitySelectionSorted {

    // Activity Selection (Already Sorted by End Time)

    public static void main(String[] args) {

        // Start time of activities
        int start[] = {10, 12, 20};

        // End time of activities (already sorted)
        int end[] = {20, 25, 30};

        // Maximum number of activities
        int maxAct = 1;

        // To store selected activity indexes
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity is always selected
        ans.add(0);
        int lastEnd = end[0];

        // Traverse remaining activities
        for (int i = 1; i < end.length; i++) {

            // Check if current activity is non-overlapping
            if (start[i] >= lastEnd) {

                // Select activity
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        // Output
        System.out.println("Maximum activities = " + maxAct);
        System.out.print("Selected activities: ");
        for (int i : ans) {
            System.out.print("A" + i + " ");
        }
    }
}
