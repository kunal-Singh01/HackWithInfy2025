package GreedyApproach;

import java.util.*;

class Job {
    String id;
    int deadline, profit;
    Job(String id, int d, int p) { this.id = id; deadline = d; profit = p; }
}

public class JobSequencing {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job("a", 4, 20),
            new Job("b", 1, 10),
            new Job("c", 1, 40),
            new Job("d", 1, 30)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxD = Arrays.stream(jobs).mapToInt(j -> j.deadline).max().getAsInt();
        boolean[] slot = new boolean[maxD + 1];
        int profit = 0;

        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    profit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Total Profit: " + profit);
    }
}

