package GreedyApproach;

import java.util.Arrays;

public class MinCoins {
    public static void main(String[] args) {
    int amount = 93;
    int[] coins = {1, 2, 5, 10, 20, 50, 100};
    Arrays.sort(coins);
    int count = 0;
    for (int i = coins.length - 1; i >= 0; i--) {
        while (amount >= coins[i]) {
        amount -= coins[i];
        count++;
    }
}
System.out.println("Minimum coins needed: " + count);
}
}
