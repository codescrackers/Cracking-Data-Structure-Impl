package com.edsoft.arrayhashbuilder;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {
        String one = "asddsa";
        String two = "sda";
        permutation(one, two);

    }

    private static void permutation(String s, String s2) {
        permutationCalculate(s, "", s2);
    }

    private static void permutationCalculate(String s, String prefix, String s2) {
        // TODO Auto-generated method stub{
        if (s.equals(s2)) {

        }
        // System.out.println(s + "\t" + s2);
        for (int i = 0; i < s.length(); i++) {
            String rem = s.substring(0, i) + s.substring(i + 1);

            permutationCalculate(rem, prefix + s.charAt(i), s2);
        }
    }

    private static String getPalindrome(String s) {
        Map<String, Integer> map = new HashMap<>();
        if (s.length() % 2 == 1) {
            for (int i = 0; i < s.length() / 2; i++) {
                // if()
            }
        }
        return s;

    }
}
