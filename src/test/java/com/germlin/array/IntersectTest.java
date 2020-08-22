package com.germlin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectTest {

    @Test
    void solution() {
        int[] nums1 = {1, 2, 3, 1, 3, 4};
        int[] nums2 = {2, 3, 3, 1};
        Intersect intersect = new Intersect();
        int[] res = intersect.solution(nums1, nums2);
        assertArrayEquals(new int[]{1, 2, 3, 3}, res);
    }
}