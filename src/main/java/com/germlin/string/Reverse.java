package com.germlin.string;

public class Reverse {
    public int solution(int x) {
        long y = (long) x;
        int sign = 1;
        if (y < 0){
            sign = -1;
            y = y * -1;
        }
        long ret = 0;
        while (y / 10 != 0) {
            long res = y % 10;
            ret = ret * 10 + res;
            y = y / 10;
        }
        ret = ret * 10 + y;
        if (ret > Integer.MAX_VALUE) {
            ret = 0;
        }
        return (int) ret * sign;
    }
}
