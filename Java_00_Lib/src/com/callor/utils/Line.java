package com.callor.utils;

public class Line {
	
	public static int lineLength = 100;
	public static String dLine = "=".repeat(lineLength);
	public static String sLine = "-".repeat(lineLength);
	
	public static String dLine(int length) {
		return "=".repeat(length);
	}
	public static String sLine(int length) {
		return "-".repeat(length);
	}
	
}//end class

// 나만의 라이브러리를 만든 것