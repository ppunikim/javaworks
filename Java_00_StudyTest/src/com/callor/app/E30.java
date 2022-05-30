package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E30 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			int intRan = (int)(Math.random() * 100) + 1;
			intList.add(intRan);
		}
		
		for(int i = intList.size() - 1; i > -1; i --) {
			if(intList.get(i) >= 54) {
				System.out.printf("%d 번째 %d값이 마지막으로 나타난 경우이다.", i + 1 , intList.get(i));
				break;
			}
		}
		
		
	}
}
