package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E51 {
	public static void main(String[] args) {
		
		List<AddressVO> adList = new ArrayList<>();
		
		for(int i = 0; i < 3; i ++) {
			AddressVO adVO = new AddressVO();
			adVO.setName("one" + i);
			adVO.setAge(33 + i);
			adList.add(adVO);
		}
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(adList);
		
		
		
		
	}//end main
}
