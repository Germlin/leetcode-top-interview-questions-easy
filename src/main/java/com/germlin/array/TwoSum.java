package com.germlin.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                res[0] = i;
                res[1] = map.get(diff);
                break;
            }
        }
        return res;
    }
}
