package com.germlin.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsValidTest {

    @Test
    void solution() {
        IsValid isValid = new IsValid();
        assertFalse(isValid.solution("([)]"));
    }
}