package com.germlin.string;

public class Palindrome {
    public boolean solution(String s) {
        int length = s.length();
        for (int i = 0, j = length - 1; i < j; ) {
            char ci = s.charAt(i);
            if (!Character.isLetterOrDigit(ci)) {
                i++;
                continue;
            }
            char cj = s.charAt(j);
            if (!Character.isLetterOrDigit(cj)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
