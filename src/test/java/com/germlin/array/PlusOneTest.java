package com.germlin.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void solution() {
        int[] digits = {1,2,3,4};
        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.solution(digits);
        assertArrayEquals(new int[]{1,2,3,5}, result);
        int[] zero = {0};
        assertArrayEquals(new int[]{1}, plusOne.solution(zero) );
    }
}