package GreedyApproach;

import java.util.*;

public class activity_selection {
    public static void main(String[] args) {
        int[] start = {1, 2, 3, 0, 5, 8};
        int[] end =   {3, 4, 5, 6, 7, 9};
        int n = start.length;

        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i]; 
            activities[i][1] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int lastEnd = activities[0][1];
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEnd) {
                count++;
                lastEnd = activities[i][1];
            }
        }
        System.out.println("Maximum non-overlapping activities: " + count);
    }
}