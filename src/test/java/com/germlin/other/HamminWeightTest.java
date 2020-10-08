package com.germlin.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamminWeightTest {

    @Test
    void solution() {
        HamminWeight hamminWeight = new HamminWeight();
        assertEquals(3,hamminWeight.solution(11));
    }
}