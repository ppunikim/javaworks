package com.callor.arrays.service;

public class ServiceV1A {
	
	/*
	 * private으로 선언된 makeScore() 는 ServiceV1A 클래스 블럭({}) 에서만 접근(호출)가능.
	 * local method(지역 메소드) 라고 한다.
	 */
	private int makeScore() {
		
		return (int)(Math.random()* 100)+1;
	}
	
	/*
	 * public으로 선언된 scoreSum()은 이 프로젝트 어디에서나 클래스의 인스턴스를
	 * 			생성하고, 인스턴스를 통하여 호출할 수 있다.
	 */
	public int scoreSum() {
		
		/*
		 * V1 에서 Math.random() 를 사용하여 점수를 생성하는 코드를 makeScore()로 이전하고,
		 * 점수 생성이 필요한 경우 makeScore()를 호출하여 결과를 사용한다.
		 */
		int intPer1 = makeScore();
		int intPer2 = makeScore();
		int intPer3 = makeScore();
		int intPer4 = makeScore();
		int intPer5 = makeScore();
		
		int intSum = intPer1;
		intSum += intPer2;
		intSum += intPer3;
		intSum += intPer4;
		intSum += intPer5;
		
		return intSum;
	}

}
