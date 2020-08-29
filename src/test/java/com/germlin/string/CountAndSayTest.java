package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    @Test
    void solution() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("1211", countAndSay.solution(4));
        assertEquals("111221", countAndSay.solution(5));
    }
}