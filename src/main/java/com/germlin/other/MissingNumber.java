package com.germlin.other;

public class MissingNumber {
    public int solution(int[] nums) {
        int length = nums.length + 1;
        int res = 0;
        int[] numbers = new int[length];
        for (int num : nums) {
            numbers[num] = 1;
        }
        for (int i = 0; i < length; i++) {
            if (numbers[i] != 1) {
                res = i;
            }
        }
        return res;
    }
}
