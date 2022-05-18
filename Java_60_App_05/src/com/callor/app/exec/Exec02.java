package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class Exec02 {
	public static void main(String[] args) {
		
		AddressVO[] addrs = new AddressVO[3];
		
		addrs[0] = new AddressVO();
		addrs[0].setName("sunny");
		addrs[0].setAge(30);
		
		addrs[1] = AddressVO.builder()
							.name("moon")
							.age(1000000000)
							.build();
		
		addrs[2] = AddressVO.builder()
							.name("sea")
							.age(5000)
							.build();
		
		for(AddressVO aVO : addrs) {
			System.out.println(aVO.toString());
		}
		
		int size = addrs.length;
		AddressVO _tVO = null; 				//배열일 경우 임시저장 장소가 필요하므로 이렇게 만들면 효율적이다.
		// 왜 메모리가 누수(낭비)될까? 임의로 만든 것이므로, for문 안에서 만들면 좋다. for문이 끝나면 같이 사라지기 때문이다.
		for(int i = 0; i < size; i ++) {
			for(int j = i + 1; j < size; j++ ) {
				if(addrs[i].getAge() > addrs[j].getAge()) {		// 배열의 i 요소인 aVO의 나이가 더 큰 값이면
					_tVO = addrs[i];							//배열의 i요소를 _tVO에 임시 저장(대피) 
					addrs[i] = addrs[j];						//i번째에 j값을 복사한다.
					addrs[j] = _tVO;							//대피한 i값(_tVO에 위치)을 j번째에 복사한다. 
				}//end if
			}//end(j)
		}//end(i)
		System.out.println();
		for(AddressVO aVO : addrs) {
			System.out.println(aVO);
		}
		
	}//end main
}//end class
