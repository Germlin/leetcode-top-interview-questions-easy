package com.germlin.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 0);
            }
        }
        return false;
    }
}
