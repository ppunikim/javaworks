package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV1;
import com.callor.arrays.service.ServiceV1A;

public class ControllerV1 {
	
	public static void main(String[] args) {
		
		ServiceV1 serviceV1 = new ServiceV1();
		
		int intSum = serviceV1.scoreSum();
		
		System.out.println("다섯명의 학생 국어점수 합은 : " + intSum);
		
		ServiceV1A serviceV1A = new ServiceV1A();
		intSum = serviceV1A.scoreSum();
		System.out.println("다섯명의 학생 국어점수 합은 : " + intSum);
		
		
	}

}
