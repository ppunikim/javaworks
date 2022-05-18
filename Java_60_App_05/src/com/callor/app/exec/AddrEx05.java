package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx05 {
	
	public static void main(String[] args) {
		
		List<AddressVO> addrList = new ArrayList<>();
		
		AddressVO adVO = new AddressVO();
		
		adVO = new AddressVO();
		adVO.setName("둘리");
		adVO.setAge(33);
		addrList.add(adVO);
		adVO = new AddressVO();
		adVO.setName("도우너");
		adVO.setAge(19);
		addrList.add(adVO);
		adVO = new AddressVO();
		adVO.setName("또치");
		adVO.setAge(74);
		addrList.add(adVO);
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrList);
		
		adVO = AddressVO.builder()
				        .name("희동")
				        .tel("010.2222")
				        .age(3)
				        .build();
		
		// addrs 리스트 2번째 데이터를 희동 데이터로 바꾸고 싶다.
		// addrs.add(AddressVO) : 데이터 추가하기
		System.out.println();
		addrList.set(1,adVO);
		adService.printAddrList(addrList);
		
		//나이를 오름차순으로 정렬하기.
		
		
	}//end main
}//end class 
