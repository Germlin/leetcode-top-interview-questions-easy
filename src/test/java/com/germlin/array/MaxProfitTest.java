package com.germlin.array;

import com.germlin.array.MaxProfit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    @Test
    void solution() {
        int[] prices = {7, 1, 5, 3, 4, 6};
        MaxProfit maxProfit = new MaxProfit();
        int result = maxProfit.solution(prices);
        assertEquals(7, result);
    }
}