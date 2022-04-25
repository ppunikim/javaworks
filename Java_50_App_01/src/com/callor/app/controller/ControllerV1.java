package com.callor.app.controller;

import java.util.List;

import com.callor.app.service.ServiceV1;

public class ControllerV1 {
	public static void main(String[] args) {
		ServiceV1 sV1 = new ServiceV1();
		sV1.makeScore();
		// 객체(method) chaining을 사용하여 코드 줄이기.
		System.out.println(sV1.getIntList().toString());
		
		// 위 한줄을 풀어쓰면 밑 두줄이 나온다.
		List<Integer> result = sV1.getIntList();
		System.out.println(result.toString()); 
		// 배열에서는 for문으로 출력해야하는데, List는 toString에 저장돼있어서 보기 편하다.
	}

}
