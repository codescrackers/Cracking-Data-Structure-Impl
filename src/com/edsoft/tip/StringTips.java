package com.edsoft.tip;

public class StringTips {

	/**
	 * Faster SplitMethod
	 * 
	 * @param s
	 *            value
	 * @param delimeter
	 *            splitted value
	 * @return String array
	 */
	public static String[] split_banthar(String s, char delimeter) {

		int count = 1;

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == delimeter)
				count++;

		String[] array = new String[count];

		int a = -1;
		int b = 0;

		for (int i = 0; i < count; i++) {

			while (b < s.length() && s.charAt(b) != delimeter)
				b++;

			array[i] = s.substring(a + 1, b);
			a = b;
			b++;

		}

		return array;

	}

}
