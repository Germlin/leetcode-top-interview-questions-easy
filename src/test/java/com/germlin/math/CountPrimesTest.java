package com.germlin.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {
    @Test
    void solution() {
        CountPrimes countPrimes = new CountPrimes();
        assertEquals(4, countPrimes.solution(10));
        assertEquals(0, countPrimes.solution(2));
        assertEquals(0, countPrimes.solution(0));
    }

}