package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E50 {
	public static void main(String[] args) {
		
		List<AddressVO> adList = new ArrayList<>();
		
		AddressVO adVO = new AddressVO();
		adVO.setName("one1");
		adVO.setAge(22);
		adList.add(adVO);
		
		adVO = AddressVO.builder().age(11).name("two").build();
		adList.add(adVO);
		
		adVO = AddressVO.builder().age(33).name("three").build();
		adList.add(adVO);
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(adList);
		
		
	}//end main
}
