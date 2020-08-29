package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtoITest {

    @Test
    void solution() {
        AtoI atoi = new AtoI();
        assertEquals(42, atoi.solution("42"));
        assertEquals(-42, atoi.solution("   -42"));
        assertEquals(4193, atoi.solution("4193 with words"));
        assertEquals(0, atoi.solution("words and 987"));
        assertEquals(-2147483648, atoi.solution("-91283472332"));
        assertEquals(-3, atoi.solution("-3.124"));
        assertEquals(0,atoi.solution("+-4"));
    }
}