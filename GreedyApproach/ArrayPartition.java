package GreedyApproach; 
import java.util.*;

public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter even number of elements (2n): ");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Please enter an even number of elements.");
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = arrayPairSum(nums);
        System.out.println("Maximum sum of min(ai, bi): " + result);
    }
}
