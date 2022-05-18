package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04 {
	
	public static void main(String[] args) {
		
		/* List : interface, 데이터 그룹을 저장하기 위한 type.
		 * 				collection type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 타입
		 * List 를 선언할 때는 Generic type을 지정한다.
		 * 이유는 1. List에 add 하는 데이터를 제한하여 
		 * 			잘못된 데이터가 add 되는 것을 방지.
		 * 		  2. 메모리 낭비를 막고 성능상 이점이 있어서.
		 * 
		 * 여기 List에 데이터를 추가하려면 먼저 AddressVO type의 
		 * vo 객체를 만들고 데이터를 저장한 다음 add 한다.
		 */
		List<AddressVO> addrList = new ArrayList<>();
		
		AddressVO adVO = new AddressVO();
		
		for(int i = 0; i < 3; i ++) {
			adVO = new AddressVO();
			int age = ((int)(Math.random() * 50) + 1);
			adVO.setAge(age);
			addrList.add(adVO);
			adVO = new AddressVO();
		}
		
		//vo 데이터를 List에 add 하기 위해서는
		//새로운 파일을 
		adVO = new AddressVO();
		adVO.setName("둘리");
		addrList.add(adVO);
		adVO = new AddressVO();
		adVO.setName("도우너");
		addrList.add(adVO);
		adVO = new AddressVO();
		adVO.setName("또치");
		addrList.add(adVO);
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrList);
		
		
		
	}
}
