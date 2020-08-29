package com.germlin.string;

public class FirstUniqChar {
    public int solution(String s){
        char[] string = s.toCharArray();
        int[] alphabet = new int[26];
        for(int i=0;i<26;i++) {
            alphabet[i] = -1;
        }
        for(int i=0;i<string.length;i++) {
            int index = string[i] - 'a';
            if(alphabet[index] == -1) {
                alphabet[index] = i;
            } else if (alphabet[index] >= 0) {
                alphabet[index] = -2;
            }
        }
        int ret = string.length;
        boolean allDuplicate = true;
        for(int i= 0;i<26;i++) {
            if(alphabet[i] >=0 && alphabet[i] < ret) {
                ret = alphabet[i];
                allDuplicate = false;
            }
        }
        return allDuplicate? -1 :ret;
    }
}
