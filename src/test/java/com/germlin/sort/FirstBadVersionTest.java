package com.germlin.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void solution() {
        FirstBadVersion firstBadVersion = new FirstBadVersion(4);
        assertEquals(4, firstBadVersion.solution(5));
        firstBadVersion = new FirstBadVersion(1);
        assertEquals(1, firstBadVersion.solution(2));
    }
}