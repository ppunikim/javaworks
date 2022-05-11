package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceV1 {
	
	/*  final : 이 변수는 딱 한번만 값을 저장할 수 있다.
	 * 
	 *  하지만 클래스 타입의 변수는 그러하지 않은 경우도 있다.
	 *  class type의 변수에 final을 선언하는 이유는 
	 *  한번 초기화된 변수를 다시 초기화하지 못하도록 하는 것이다.
	 *  
	 *  특히, List type과 같이 많은 데이터를 저장하는 변수들은 
	 *  final로 선언하는것을 적극 권장한다.
	 */
	private final List<Integer> intList;
	private final int num;
	
	public ServiceV1() {
		intList = new ArrayList<>(); 
		// ArrayList : 비어있는 리스트를 선언하는 것이다.
		// Generic(<>) : 그 타입의 리스트를 저장해라.
		num = 0; // final로 선언된 변수는 반드시 생성자에서 초기화 해야한다.
	}//end 기본생성자
	
	public void makeScore() {
		for(int i=0; i< 10 ; i++) {
			int rnd = (int)(Math.random()*100)+1;
			intList.add(rnd);
		}//end for
		
		//intList = new ArrayList<>();
		//intList는 final로 선언되었다.
		// final로 사용하면 또 초기화 하는 것을 방지함.
		
		
	}//end makeScore()
	
	public List<Integer> getIntList(){
		return intList;
	}//end getIntList()
	
	
}//end class
