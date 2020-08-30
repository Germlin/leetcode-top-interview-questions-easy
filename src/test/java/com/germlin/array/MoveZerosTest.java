package com.germlin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    void solution() {
        MoveZeros moveZeros = new MoveZeros();

        int[] nums1 = {0, 1, 2, 0, 0, 3};
        moveZeros.solution(nums1);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0}, nums1);

        int[] nums2 = {1};
        moveZeros.solution(nums2);
        assertArrayEquals(new int[]{1}, nums2);
    }
}