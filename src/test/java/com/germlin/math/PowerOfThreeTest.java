package com.germlin.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    @Test
    void solution() {
        PowerOfThree powerOfThree = new PowerOfThree();
        powerOfThree.solution(27);
        assertTrue(powerOfThree.solution(27));
    }
}