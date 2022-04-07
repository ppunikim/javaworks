package com.callor.app.service;

public class Service2A {
	
	public void print() {
		
		// ServiceV2 와 Service2A는 같은 package( c.c.a.Service)
		// 에 저장된 클래스 이기 때문에 import문이 필요없다.
		ServiceV2 serviceV2 = new ServiceV2();
		
		// sum()은 private으로 설정됐기 때문에 호출 X.
		// serviceV2.sum();
		
		//add()는 한정자를 생략해서 같은 package에 있는 클래스
		//들 끼리는 호출이 가능하다.
		serviceV2.add();
		
	}

}
