package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E29 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			int intRan = (int)(Math.random() * 100 ) + 1;
			intList.add(intRan);
		}
		for(int i = 0; i < 100; i ++) {
			if(intList.get(i) >= 54) {
				System.out.printf("%d 번째에서 %d의 값이 최초로 나왔다.", i+1, intList.get(i));
				break;
			}
		}
	}
}
