package com.germlin.math;

public class PowerOfThree {
    public boolean solution(int n) {
        int max = (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3)));
        return n > 0 && max % n == 0;
    }
}
