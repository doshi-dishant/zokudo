package com.zokudo.framework.runner;

public class Test {
	static String str = "diSHanT jaYeshbhai dOShi";

	public static void main(String[] args) {
		boolean flag = true;
		str = str.toLowerCase();
		String result = String.valueOf(str.charAt(0)).toUpperCase();
		for (int i = 1; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).equals(" ") && i != str.length() - 1) {
				result = result + " " + String.valueOf(str.charAt(i + 1)).toUpperCase();
				flag = false;
			} else {
				if (flag)
					result = result + String.valueOf(str.charAt(i));
				flag = true;
			}
		}
		System.out.println(result);
	}
}
