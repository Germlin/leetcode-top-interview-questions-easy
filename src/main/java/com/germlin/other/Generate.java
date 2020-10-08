package com.germlin.other;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> solution(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 1) {
                row.add(1);
                res.add(row);
                continue;
            }
            for (int j = 0; j < i; j++) {
                List<Integer> pre = res.get(i - 2);
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    row.add(pre.get(j) + pre.get(j - 1));
                }
            }
            res.add(row);
        }
        return res;
    }
}
