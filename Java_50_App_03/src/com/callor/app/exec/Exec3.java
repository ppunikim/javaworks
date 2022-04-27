package com.callor.app.exec;

public class Exec3 {
	public static void main(String[] args) {

		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 50) + 51;
			intSum = even(num);
		}
		System.out.println(intSum);

	}// end main

	public static int even(int num) {

		if (num % 2 == 0) {
			return num;
		} else {
			return 0;
		}

	}

}
