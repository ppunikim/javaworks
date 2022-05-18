package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;

public class Exec03 {
	public static void main(String[] args) {
		
		List<AddressVO> addrs = new ArrayList<>();
		AddressVO aVO = new AddressVO();
		
		aVO.setName("sunny");
		aVO.setAge(30);
		addrs.add(aVO);
		
		addrs.add(AddressVO.builder().name("moon").age(1000000000).build());
		addrs.add(AddressVO.builder().name("sea").age(5000).build());
		addrs.add(new AddressVO());	//한 개의 빈 데이터 만들기

		int size = addrs.size(); 	//리스트의 size 값을 확인하고
		addrs.get(size - 1).setName("soild");	// size - 1 위치(마지막 배열 값은 1개 작은 수의 위치이므로)의 객체에 요소 값을 setting
		addrs.get(size - 1).setAge(1);
		
		for(AddressVO VO : addrs) {
			System.out.println(VO);
		}
		
		
		size = addrs.size(); 	//사이즈 값을 다시 정의해줌.
		for(int i = 0; i < size; i ++) {
			for(int j = i + 1; j < size; j++ ) {
				if(addrs.get(i).getAge() > addrs.get(j).getAge()) {		
					AddressVO _tVO = addrs.get(i);		
					addrs.set(i, addrs.get(j));		//i번째 요소 위치에 j번째 값 복사
					addrs.set(j, _tVO);				//대피해두었던 i번째 요소 값을 j번째에 복사
				}//end if
			}//end(j)
		}//end(i)
		System.out.println();
		for(AddressVO VO : addrs) {
			System.out.println(VO);
		}
		
	}//end main
}//end class
