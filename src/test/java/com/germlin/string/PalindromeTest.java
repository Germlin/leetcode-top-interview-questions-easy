package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void solution() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.solution("race a car"));
        assertTrue(palindrome.solution("A man, a plan, a canal: Panama"));
    }
}