package GreedyApproach;

import java.util.Scanner;

public class Buy2Chocolate {
    public static int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }

        int cost = min1 + min2;
        if (cost <= money) {
            return money - cost;
        } else {
            return money;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the prices of chocolates:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.print("Enter your total money: ");
        int money = sc.nextInt();
        int leftover = buyChoco(prices, money);
        System.out.println("Leftover money after buying two chocolates: " + leftover);

        sc.close();
    }
    
}
