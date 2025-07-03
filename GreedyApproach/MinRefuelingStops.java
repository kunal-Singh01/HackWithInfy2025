package GreedyApproach;

import java.util.*;
public class MinRefuelingStops {
    public static void main(String[] args) {
        int target = 100, startFuel = 10;
        int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int fuel = startFuel, stops = 0, i = 0;
        
        while (fuel < target) {
            while (i < stations.length && stations[i][0] <= fuel) {
            maxHeap.add(stations[i][1]);
        i++;
    }
    if (maxHeap.isEmpty()) {
        System.out.println("-1");
        return;
    }
    fuel += maxHeap.poll();
    stops++;
    }
    System.out.println("Minimum refueling stops: " + stops);
    }
}
