package com.germlin.dynamic;

public class ClimbStairs {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int n1 = 1;
        int n2 = 2;
        int n3 = n1 + n2;
        for(int i = 3;i<=n;i++) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
