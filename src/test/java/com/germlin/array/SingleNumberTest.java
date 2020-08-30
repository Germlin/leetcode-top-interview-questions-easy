package com.germlin.array;

import com.germlin.array.SingleNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void solution() {
        int[] nums = {1, 2, 3, 1, 2};
        SingleNumber singleNumber = new SingleNumber();
        int result = singleNumber.solution(nums);
        assertEquals(3, result);
    }
}