package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx03 {
	
	public static void main(String[] args) {
		
		AddressVO[] adVO = new AddressVO[3];

		adVO[0] = AddressVO.builder().name("길동").tel("010").build();
		
		adVO[1] = new AddressVO();
		adVO[1].setName("또치");
		adVO[1].setTel("101");

		adVO[2] = new AddressVO();
		adVO[2].setName("도우너");
		adVO[2].setTel("202");
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(adVO);
		
		
		
		
	}
}
