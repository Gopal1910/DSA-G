import java.util.*;

public class JobSequencingProblem {

    // Job Sequencing Problem

    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {

        Job jobs[] = {
            new Job('A', 4, 20),
            new Job('B', 1, 10),
            new Job('C', 1, 40),
            new Job('D', 1, 30)
        };

        // Sort jobs by profit (descending)
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job j : jobs) {
            maxDeadline = Math.max(maxDeadline, j.deadline);
        }

        boolean slot[] = new boolean[maxDeadline + 1];
        char result[] = new char[maxDeadline + 1];

        // Greedy scheduling
        for (Job job : jobs) {
            for (int t = job.deadline; t > 0; t--) {
                if (!slot[t]) {
                    slot[t] = true;
                    result[t] = job.id;
                    break;
                }
            }
        }

        System.out.print("Selected Jobs: ");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
    }
}
