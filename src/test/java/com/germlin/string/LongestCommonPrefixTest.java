package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void solution() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        assertEquals("fl", longestCommonPrefix.solution(strs));
    }
}