package com.germlin.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {
    public int[] solution(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1 = nums1.length;
        int l2 = nums2.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < l1 && j < l2; ) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else {
                if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    i++;
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
