package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV22 {
	public static void main(String[] args) {
		
		List<Integer> scoreList = new ArrayList<Integer>();	
		ServiceV2 sV2 = new ServiceV2(scoreList);
		System.out.println(scoreList);
		
		sV2.getScore(10); // getScore method를 호출하고
		System.out.println(scoreList); // scoreList를 출력했다.
		// 이 두개는 scoreList와 intList의 주소값이 같아서 return안해도 된다.
		
		
		
	}//end main
}//end class
