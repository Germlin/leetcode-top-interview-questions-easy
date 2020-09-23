package com.germlin.math;

import java.util.Arrays;

public class CountPrimes {
    public int solution(int n) {
        if (n <= 1) {
            return 0;
        }
        int[] nums = new int[n];
        Arrays.fill(nums, 1);
        nums[0] = 0;
        for (int i = 2; i < n; i++) {
            if (1 == nums[i - 1]) {
                for (int j = 2 * i; j < n; j += i) {
                    nums[j - 1] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            count += nums[i];
        }
        return count;
    }
}
