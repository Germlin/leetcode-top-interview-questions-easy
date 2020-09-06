package com.germlin.sort;

public class Merge {
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m + n];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            int num1 = nums1[i];
            int num2 = nums2[j];
            if (num1 < num2) {
                merge[index] = num1;
                i++;
            } else {
                merge[index] = num2;
                j++;
            }
            index++;
        }
        while (i < m) {
            merge[index] = nums1[i];
            i++;
            index++;
        }
        while (j < n) {
            merge[index] = nums2[j];
            j++;
            index++;
        }
        System.arraycopy(merge, 0, nums1, 0, m + n);
    }
}
