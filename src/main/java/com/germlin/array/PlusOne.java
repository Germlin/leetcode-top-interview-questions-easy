package com.germlin.array;

public class PlusOne {
    public int[] solution(int[] digits) {
        int i = digits.length - 1;
        int remainder = 0;
        int[] res = digits;
        for (; i >= 0; i--) {
            int temp = digits[i] + 1;
            digits[i] = temp % 10;
            remainder = temp / 10;
            if (remainder == 0) {
                break;
            }
        }
        if (i < 0 && remainder == 1) {
            res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
        }
        return res;
    }
}
