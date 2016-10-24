package com.edsoft.arrayhashbuilder;

/**
 * Tekrarlayan karakterleri baz alarak String Compression
 * 
 * @author Yusuf ONDER
 *
 */
public class StringCompression {
	public static void main(String[] args) {
		String w1 = "bbbbbbvbbbbac";
		System.out.println(compressed(w1));
	}

	private static String compressed(String s) {
		StringBuilder builder = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (i == s.length() - 2) {
				if (s.charAt(i + 1) != s.charAt(i)) {
					builder.append(String.valueOf(s.charAt(i + 1)) + 1);
				} else {
					count++;
					builder.append(String.valueOf(s.charAt(i)) + count);
				}
			} else if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				builder.append(String.valueOf(s.charAt(i)) + count);
				count = 1;
			}
		}
		return builder.toString().length() < s.length() ? builder.toString() : s;
	}
}
