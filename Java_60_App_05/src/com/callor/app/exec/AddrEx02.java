package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	public static void main(String[] args) {
		
		AddressVO hong = AddressVO.builder()
									.name("길동")
									.tel("010-2220-333")
									.addr("서울")
									.build();
		
		AddrServiceV1 addService = new AddrServiceV1();
		addService.printAddr(hong);
		
	}//end main
}

