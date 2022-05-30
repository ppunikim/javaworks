package com.callor.app;

public class E49 {
	public static void main(String[] args) {
		
		AddressVO hong = AddressVO.builder().age(23).name("one").build();
		
		AddrServiceV1 s49 = new AddrServiceV1();
		s49.printAddr(hong);
		
	}//end main
}
