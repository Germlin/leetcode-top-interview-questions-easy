package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void solution() {
        ReverseString reverseString = new ReverseString();
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString.solution(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }
}