import java.util.*;

public class ActivitySelectionUnsorted {

    // Activity Selection (If activities are NOT sorted)

    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[]   = {2, 4, 6, 7, 9, 9};

        // Store activities as: index, start, end
        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sort by end time
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        // Select first activity
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        // Greedy selection
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum activities = " + maxAct);
        System.out.print("Selected activities: ");
        for (int i : ans) {
            System.out.print("A" + i + " ");
        }
    }
}
