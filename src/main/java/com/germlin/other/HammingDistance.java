package com.germlin.other;

public class HammingDistance {
    public int solution(int x, int y) {
        int res = x ^ y;
        return Integer.bitCount(res);
    }
}
