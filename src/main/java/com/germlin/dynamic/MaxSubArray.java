package com.germlin.dynamic;

public class MaxSubArray {
    public int solution(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0) {
                nums[i] = nums[i] + nums[i-1];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
