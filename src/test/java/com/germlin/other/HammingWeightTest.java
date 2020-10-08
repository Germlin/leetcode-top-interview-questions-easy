package com.germlin.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingWeightTest {

    @Test
    void solution() {
        HammingWeight hammingWeight = new HammingWeight();
        assertEquals(3, hammingWeight.solution(11));
    }
}