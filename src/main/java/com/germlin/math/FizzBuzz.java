package com.germlin.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> solution(int n) {
        List<String> stringList = new ArrayList<>();
        int nextFizz = 3;
        int nextBuzz = 5;
        for (int i = 1; i <= n; i++) {
            String num = "";
            if (i == nextFizz) {
                num += "Fizz";
                nextFizz += 3;
            }
            if (i == nextBuzz) {
                num += "Buzz";
                nextBuzz += 5;
            }
            if (num.length() == 0) {
                num = String.valueOf(i);
            }
            stringList.add(num);
        }
        return stringList;
    }
}
