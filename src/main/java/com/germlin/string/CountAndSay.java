package com.germlin.string;

import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
    public String solution(int n) {
        List<String> list = new ArrayList<>();
        list.add("1");
        for (int i = 0; i < 30; i++) {
            String last = list.get(i);
            int j = 0;
            char p = last.charAt(j);
            int m = 1;
            StringBuilder present = new StringBuilder();
            for (j = 1; j < last.length(); j++) {
                char c = last.charAt(j);
                if (p == c) {
                    m++;
                } else {
                    present.append(m).append(p);
                    p = c;
                    m = 1;
                }
            }
            present.append(m).append(p);
            list.add(present.toString());
        }
        return list.get(n-1);
    }
}
