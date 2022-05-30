package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E52 {
	public static void main(String[] args) {
		
		List<AddressVO> adList = new ArrayList<>();
		
		AddressVO adVO = new AddressVO();
		adVO.setName("one");
		adVO.setAge(500);
		adList.add(adVO);
		
		adVO = AddressVO.builder().name("two").age(10).build();
		adList.add(adVO);
		
		adVO = AddressVO.builder().name("three").age(100).build();
		adList.add(adVO);
		
		for(int i = 0; i < adList.size(); i ++) {
			for(int j = 0; j < adList.size(); j ++) {
				if(adList.get(i).getAge() < (adList.get(j).getAge())) {
					AddressVO adVOs = adList.get(i);
					adList.set(i, adList.get(j));
					adList.set(j, adVOs);
				}
			}
		}
		for(AddressVO vo : adList) {
			System.out.println(vo);
		}
		
		
		
	}//end main
}//end class
