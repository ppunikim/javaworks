package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControllerV1 {
	public static void main(String[] args) {
		
		// ServiceV1을 선언만 한 상태로, 
		// 클래스를 사용하여 instance(인스턴스)를 만들었다.
		ServiceV1 serviceV1;
		serviceV1 = new ServiceV1();
		
		int sum = serviceV1.scoreSum();
		
		
		System.out.println("국영수 총점 : " + sum );
		
		
		
	}

}
