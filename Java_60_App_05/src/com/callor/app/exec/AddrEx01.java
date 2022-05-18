package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class AddrEx01 {
	public static void main(String[] args) {
		
	/* AddressVO 클래스를 사용하여 3개의 객체 인스턴스 생성
	 * 동일한 클래스를 사용하여 생성하였지만 
	 * 각각의 객체(hong, lee, sung)는 완전히 독립된 상태이다.
	 * 특별히 일부러 코드를 작성하지 않는 한, 각각의 객체는 서로에게 영항을 미치지 않는다.
	 * 
	 * 데이터를 저장할 때 VO 클래스를 선언하고 객체를 만드는 이유
	 * : 주소록 관리 애플리케이션을 만든다고 하면 
	 * 	각각의 주소 데이터에는 이름, 주소, 전화번호, 나이, 취미 등이 필요하다.
	 * 	이 데이터들은 개별적인 변수로 선언하거나 각각의 배열로 선언하여 사용할 수 있다.
	 *  이름 - 주소 - 나이 - 전화번호 - 취미 등 데이터 연결이 매우 불편할 수 있다.
	 *  
	 *  따라서 이러한 문제를 해결하기 위해
	 *  객체지향에서는 이러한 개별적인 변수들을 하나의 클래스(VO)로 묶고
	 *  클래스를 사용하여 객체를 생성하면 객체와 함꼐 묶음으로 데이터를 관리할 수 있기 때문에
	 *  데이터가 서로 다른 값이 저장되는 것을 방지할 수 있다.
	 *  
	 *  어떤 연산을 하기 위해서 method에 매개변수를 전달하거나 
	 *  연산결과를 return할 때도 객체단위로 이동 가능하다.
	 */
	AddressVO hong = new AddressVO();
	AddressVO lee = new AddressVO();
	AddressVO sung = new AddressVO();
	
	hong.setName("홍게");
	lee.setName("리본");
	sung.setName("성게");
	
	hong.setTel("010-111");
	lee.setTel("010-222");
	sung.setTel("010-333");
	
	System.out.println(hong.toString());
	System.out.println(lee.toString());
	System.out.println(sung.toString());
	
	}//end main
}
