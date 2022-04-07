package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

public class ControllerV2 {
	
	public static void main(String[] args) {
	
		
		int sum = sum();
		System.out.println(sum);
		
		ServiceV2 serviceV2 = new ServiceV2();
		// ServiceV2 클래스의 sum nethod는 private이기 때문에 
		// 여기에서는 호출 X.
		// int sum2 = serviceV2.sum();
		
		
		
		
		/*
		 * ServiceV2 클래스의 add method는 한정자가 생략됨,
		 * 하지만 Controller package의 ControllerV2클래스에서는
		 * 호출불가능. 이유는 package의 위치가 다르기 때문
		 * int add = serviceV2.add();
		 */
	// 	int add = serviceV2.add();
		
		
	}// end main
	
	
	
	// 같은 클래스 안에 있는 것은 public을 생략할 수 있다.
	// private는 개인적으로 보는 코드를 만드는 것이다.
	private static int sum() {
		
		return 30 + 40;
	} // end sum

}
