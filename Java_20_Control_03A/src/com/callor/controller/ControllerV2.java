package com.callor.controller;

import com.callor.service.ServiceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		
		ServiceV2 serviceV2 = new ServiceV2();
		int intSum = serviceV2.add();
		int intMulti = serviceV2.multi();
		
		System.out.println(intSum);
		System.out.println(intMulti);
		
		
	}

}
