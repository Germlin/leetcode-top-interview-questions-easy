package com.germlin.array;

public class SingleNumber {
    public int solution(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
