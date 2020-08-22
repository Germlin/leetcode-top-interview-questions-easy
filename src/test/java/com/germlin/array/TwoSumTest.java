package com.germlin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void solution() {
        int[] nums = {1, 2, 3, 5};
        int target = 5;
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{1, 2}, twoSum.solution(nums, target));
    }
}