package com.callor.app;

import java.util.List;

public class AddrServiceV1 {
	
	public void printAddr(AddressVO hong) {
 		System.out.println(hong);
	}  // 한명의 정보 출력( E49에 필요)
	
	public void printAddrList(AddressVO[] list) {
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
	}// 배열을 출력( E50에 필요)

	public void printAddrList(List<AddressVO> adList) {
		for(AddressVO vo : adList) {
			System.out.println(vo);
		}
		
	}// 리스트 출력( E50에 필요),( E51에 필요) 
	
	
	
	
}
