package com.edsoft.arrayhashbuilder;

/**
 * Stringler URL'e ugun hale getirilir
 *
 * @author Yusuf ONDER
 */
public class URLify {
    public static void main(String[] args) {
        String word = "Yusuf ONDER Kemal ";
        System.out.println("Word Length --> " + word.length());

        word = changeWhitespaces(word);
        System.out.println("New word --> " + word);
        System.out.println("New word Length --> " + length(word));
    }

    private static String changeWhitespaces(String s) {
        s = s.replaceAll(" ", "%20");
        return s;
    }

    private static int length(String s) {
        if (s.substring(s.length() - 3, s.length()).equals("%20")) {
            return s.length() - ((s.split("%20").length - 1) * 2) - 2;
        }
        return s.length() - ((s.split("%20").length - 1) * 2);
    }
}
