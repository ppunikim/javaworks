package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;

public class Exec05 {
	public static void main(String[] args) {
		
		List<AddressVO> addrs = new ArrayList<>();
		AddressVO aVO = new AddressVO();
		
		aVO.setName("나");
		aVO.setAge(30);
		addrs.add(aVO);
		
		addrs.add(AddressVO.builder().name("라").age(1000000000).build());
		addrs.add(AddressVO.builder().name("마").age(5000).build());
		addrs.add(new AddressVO());	

		int size = addrs.size(); 	
		addrs.get(size - 1).setName("가");	
		addrs.get(size - 1).setAge(1);
		
		for(AddressVO VO : addrs) {
			System.out.println(VO);
		}
		
		
		size = addrs.size(); 	//사이즈 값을 다시 정의해줌.
		for(int i = 0; i < size; i ++) {
			for(int j = i + 1; j < size; j++ ) {
				if(addrs.get(i).getName().compareTo(addrs.get(j).getName()) > 0) {		
					AddressVO _tVO = addrs.get(i);		
					addrs.set(i, addrs.get(j));		
					addrs.set(j, _tVO);				
				}//end if
			}//end(j)
		}//end(i)
		System.out.println();
		for(AddressVO VO : addrs) {
			System.out.println(VO);
		}
		
	}//end main
}//end class
