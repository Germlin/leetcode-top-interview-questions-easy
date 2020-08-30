package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqCharTest {

    @Test
    void solution() {
        FirstUniqChar firstUniqChar = new FirstUniqChar();
        assertEquals(0, firstUniqChar.solution("leetcode"));
        assertEquals(2, firstUniqChar.solution("loveleetcode"));
        assertEquals(-1, firstUniqChar.solution(""));
    }
}