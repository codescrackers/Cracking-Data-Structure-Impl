package com.edsoft.technicalquestions;

/**
 * Bir stringin diğer string içinde olup olmadığını gösterir
 *
 * @author sadun.sozer
 */
public class SearchString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String first = "asda";
        String second = "asdasdewsadasda";
        System.out.println(find(first, second));
    }

    private static int find(String f, String s) {
        int count = 0;
        for (int i = 0; i < s.length() - f.length() + 1; i++) {
            if (f.equals(s.substring(i, i + f.length()))) {
                count++;
            }
        }
        return count;
    }

    // private static String permutation

}
