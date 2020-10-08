package com.germlin.other;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateTest {
    @Test
    public void solution() {
        Generate generate = new Generate();
        List<List<Integer>> res = generate.solution(5);
        System.out.println(res);
    }

}