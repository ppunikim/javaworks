package com.callor.controller;

import com.callor.service.ServiceV1;

public class ControllerV1 {
	
	public static void main(String[] args) {
		
		int intSum = ServiceV1.add();
		int intMulti = ServiceV1.multi();
		
		System.out.println(intSum + intMulti);
		
	}

}
