package com.germlin.array;

public class RemoveDuplicates {

    public int solution(int[] nums) {
        int length = nums.length;
        int previous = 0;
        int index = 0;
        int num = 0;
        for(int i=0;i<length;i++) {
            if(i==0) {
                previous = nums[i];
                num = 1;
                index ++;
                continue;
            }
            if(nums[i]!=previous) {
                num ++;
                nums[index] = nums[i];
                index ++;
                previous = nums[i];
            }
        }
        return num;
    }
}
