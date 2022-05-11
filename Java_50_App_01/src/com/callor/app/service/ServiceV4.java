package com.callor.app.service;

public class ServiceV4 {
	private final int[] intArray; // 배열 만듦.
	public ServiceV4(int[] intArray) {
		this.intArray = intArray; // this 는 ServiceV4를 뜻함.
	}//end 임의생성자
	
	public void makeScore() {
		for(int i=0; i<intArray.length; i++) {
			int rnd = (int)(Math.random()*100)+1;
			intArray[i] = rnd;
		}
	}

}
