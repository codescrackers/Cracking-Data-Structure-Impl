package com.edsoft.arrayhashbuilder;

/**
 * İki Stringten birinin diğerinin permütasyonu olup olmadığını gösteren sınıf
 *
 * @author Yusuf ONDER
 */
public class PermutationString {
    private static boolean permutation = false;

    public static void main(String[] args) {
        String one = "asddsa";
        String two = "sda";
        permutation(one, two);
        System.out.println(permutation);
    }

    private static void permutation(String s, String s2) {
        permutationCalculate(s, "", s2);
    }

    private static void permutationCalculate(String s, String prefix, String s2) {
        // TODO Auto-generated method stub{
        if (s.equals(s2)) {
            permutation = true;
        }
        // System.out.println(s + "\t" + s2);
        for (int i = 0; i < s.length(); i++) {
            String rem = s.substring(0, i) + s.substring(i + 1);
            permutationCalculate(rem, prefix + s.charAt(i), s2);
        }
    }
}
