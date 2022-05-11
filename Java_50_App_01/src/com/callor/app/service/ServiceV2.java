package com.callor.app.service;

import java.util.List;

public class ServiceV2 {
	private final List<Integer> intList;
	
	// intList를 직접 초기화하지 않고, 
	// ServiceV2를 사용하는 곳에서 주입하기.
	public ServiceV2(List<Integer> intList) {
		this.intList = intList;
	}
	
	/* length 변수를 매개변수로 받아서
	 * length 개수만큼 random 수를 저장한 
	 * intList를 return 한다. 
	 */
	public List<Integer> getScore(int length ){
		for(int i=0; i< length; i++) {
			int rnd = (int)(Math.random()*100)+1;
			intList.add(rnd);
		}//end for
		return intList;
	}//end getScore 임의생성자
	// interface로 매개변수로 선언한 것이다.
	// List를 바꾸고 싶으면, 매게변수를 바꾸면 된다.

}
