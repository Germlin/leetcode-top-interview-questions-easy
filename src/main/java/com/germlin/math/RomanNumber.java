package com.germlin.math;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public int solution(String s) {
        Map<Character, Integer> char2IntMap = new HashMap<>();
        char2IntMap.put('I', 1);
        char2IntMap.put('V', 5);
        char2IntMap.put('X', 10);
        char2IntMap.put('L', 50);
        char2IntMap.put('C', 100);
        char2IntMap.put('D', 500);
        char2IntMap.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            Character present = s.charAt(i);
            Integer p = char2IntMap.get(present);
            if (i + 1 < s.length()) {
                Character next = s.charAt(i + 1);
                Integer n = char2IntMap.get(next);
                if (p < n) {
                    num += (n - p);
                    i++;
                    continue;
                }
            }
            num += p;
        }
        return num;
    }
}
