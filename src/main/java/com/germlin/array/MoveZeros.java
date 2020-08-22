package com.germlin.array;

public class MoveZeros {
    public void solution(int[] nums) {
        for (int index = 0, notZero = 0; notZero < nums.length; notZero++) {
            if (nums[notZero] != 0) {
                int temp = nums[index];
                nums[index] = nums[notZero];
                nums[notZero] = temp;
                index++;
            }
        }
    }
}
