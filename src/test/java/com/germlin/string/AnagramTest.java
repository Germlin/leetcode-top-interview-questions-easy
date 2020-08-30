package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void solution() {
        Anagram anagram = new Anagram();
        assertFalse(anagram.solution("cat", "rat"));
        assertTrue(anagram.solution("anagram", "nagaram"));
    }
}