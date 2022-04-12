package com.callor.arrays.exec;

public class ExecV5 {
	public static void main(String[] args) {

		int Sum = 0;
		//for문을 꼭 0부터 100까지로 적고,
		//내부 값을 바꾸자.
		for (int i = 0; i < 100; i++) {
			Sum += (i+1);
		} // end for

		System.out.println(Sum);
	}// end main

}// end class
