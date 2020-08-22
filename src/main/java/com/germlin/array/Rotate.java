package com.germlin.array;

public class Rotate {
    public void solution(int[] nums, int k) {
        int l = nums.length;
        int[] newNums = new int[l];
        for (int i = 0; i < l; i++) {
            int index = ((k % l) + i) % l;
            newNums[index] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, l);
    }
}
