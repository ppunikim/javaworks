package com.callor.arrays.service;

public class ServiceV1 {
	
	public int scoreSum() {
		
		int intPer1 = (int)(Math.random()* 100)+ 1;
		int intPer2 = (int)(Math.random()* 100)+ 1;
		int intPer3 = (int)(Math.random()* 100)+ 1;
		int intPer4 = (int)(Math.random()* 100)+ 1;
		int intPer5 = (int)(Math.random()* 100)+ 1;
		
		int intSum = intPer1;
		intSum += intPer2;
		intSum += intPer3;
		intSum += intPer4;
		intSum += intPer5;
		
		return intSum;
	}

}
