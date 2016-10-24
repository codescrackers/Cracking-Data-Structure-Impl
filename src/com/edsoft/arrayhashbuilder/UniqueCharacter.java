package com.edsoft.arrayhashbuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Stringin içindeki karakterlerin unique olup olmadığını kontrol eder
 *
 * @author Yusuf ONDER
 */
public class UniqueCharacter {
    public static void main(String[] args) {
        String word = "aaabbbsda";
        System.out.println(isUnique(word));
    }

    private static boolean isUnique(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (Character c : word.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, count++);
            } else {
                return false;
            }
        }
        return true;
    }
}
