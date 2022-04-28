package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec5 {
	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			num.add((int) (Math.random() * 100) + 1);
		} // 100개의 랜덤값 이나오는 100개의 정수 생성

		int intSize = num.size();
		int intThan = 0;
		for (int i = 0; i < intSize; i++) {
			int intLis = num.get(i);
			intThan = intLis;
			if (intThan >= intLis) {
				intThan = intLis;
			}
			System.out.println(intThan);
		}

	}// end main
}
