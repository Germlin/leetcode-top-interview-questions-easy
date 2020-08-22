package com.germlin.array;

public class MaxProfit {
    public int solution(int[] prices) {
        int i = 0;
        int j = 1;
        int maxProfit = 0;
        int length = prices.length;
        for(;j<length;i++,j++) {
            if(prices[j]>=prices[i]) {
                maxProfit += (prices[j]-prices[i]);
            }
        }
        return maxProfit;
    }
}
