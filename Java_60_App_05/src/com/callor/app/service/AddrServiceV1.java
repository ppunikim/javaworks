package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {
	
	public void printAddr(AddressVO name) {
		System.out.println(name); 				// toString 은 생략돼있다.
		//System.out.println(name.toString()); 
	};
	
	
	public void printAddrList(AddressVO[] addList) {
		for(int i = 0; i < addList.length; i ++) {
			System.out.println(addList[i].toString());
		}
		for(AddressVO vo : addList) {
			System.out.println(vo);
		}//위의 것과 같다. 이것은 확장 for문으로 사용한 것이다.
		
	}
	

	public void printAddrList(List<AddressVO> addrList) {
		for(AddressVO vo : addrList) {
			System.out.println(vo.toString());
		}
	}
	
	
	
}
