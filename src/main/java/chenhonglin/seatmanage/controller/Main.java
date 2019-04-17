package chenhonglin.seatmanage.controller;

import java.util.Arrays;

public class Main {
    public static void main(int[] nums) {
        System.out.println(minMoves(nums));
    }

    public static int minMoves(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        } else {
            Arrays.sort(nums);
            int mean = nums[n / 2];
            int i;
            int res = 0;
            for (i = 0; i < n; i++) {
                res += Math.abs(nums[i] - mean);
            }
            return res;
        }

    }
}
