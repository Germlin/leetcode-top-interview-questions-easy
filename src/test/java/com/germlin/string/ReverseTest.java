package com.germlin.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void solution() {
        Reverse reverse = new Reverse();
        assertEquals(-123, reverse.solution(-321));
        assertEquals(0, reverse.solution(-2147483648));
    }
}