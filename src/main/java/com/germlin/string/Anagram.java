package com.germlin.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean solution(String s, String t) {
        Map<Character, Integer> sMap = countLetter(s);
        Map<Character, Integer> tMap = countLetter(t);
        return sMap.equals(tMap);
    }

    private Map<Character, Integer> countLetter(String s) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character letter = s.charAt(i);
            if (alphabet.containsKey(letter)) {
                int num = alphabet.get(letter);
                alphabet.put(letter, num + 1);
            } else {
                alphabet.put(letter, 1);
            }
        }
        return alphabet;
    }
}
