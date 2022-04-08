package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV2;

public class ControllerV2 {
	
	public static void main(String[] args) {
		// 1 의 class를 사용해서 2 객체(object)를 선언하고 
		// 3 생성자 메서드를 호출하여 4를 인스턴스로 생성한다.
		//즉, 한마디로 1 type의 2 인스턴스 생성하기.
		/*
		 * 2의 인스턴스를 생성하기 위해서는 1 클래스의 생성자 4를 호출하여
		 * 		새로운(new)인스턴스(즉, 초기화하여)를 만든다.  
		 */
		// 1         2         3      4
		ServiceV2 serviceV2 = new ServiceV2();
		serviceV2.scoreKorSum();
	}

}
