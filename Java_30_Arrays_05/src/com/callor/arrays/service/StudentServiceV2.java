package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;
//객체정의 두 가지 : 상속, 재 정의
public class StudentServiceV2 extends StudentServiceV1 {
	/* ServiceV2에서 ServiceV1을 상속받았다.
		상속 받으면 ServiceV1에 선언된 변수, method를 그대로 물려받음(생성자 제외)
		"상속 키워드가 extends 인것에 주목"
	 */
	public StudentServiceV2() {
		
		this(10);
	}
	//임의 생성자
	public StudentServiceV2(int length) {
		
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}
	/*
	 * Override(재 정의) 
	 * ServiceV1에 선언된 메서드 중, 나머지는 그대로 쓰고,
	 * inputStudent 메서드는 내가 원하는 코드로 바꿔서 다시 사용하겠다.
	 */
	@Override
	public int inputStudent() {
		
		System.out.println(Line.dLine(50));
		System.out.println("학생 정보 입력 V2");
		System.out.println(Line.sLine(50));
		
		//for문이 입력되기 전에 index문이 선언되었는데, 
		// 			이것은 for문이 잘 동작되는지 확인하기 위해 사용하는 것이다.
		int index = 0;
		for( index = 0; index < strStudents.length; index++ ) {
			System.out.printf("%d번 학생 입력 (QUIT : 중단) > ", index +1 );
			String strName = scan.nextLine();
			//문자열은 저장되는 방식이 달라서 ==를 사용하면 안된다.
			// 실수 방지용으로 Q 한개만 사용하는 것보다 대문지로 QUIT를 하는것이 좋다.
			if(strName.equals("QUIT")) {
				break;
			}
			strStudents[index] = strName;
			
		}//end for
		if(index < strStudents.length) {
			System.out.println("입력이 중단되었습니다.");
		} else {
			System.out.println("입력을 모두 마쳤습니다.");
		}
		
/*		부등호는 같이 사용(<=, =>)하는 것은 좋지 않다.
 * 			 그 이유는 잘못해서 등호를 쓰지 않은 오류를 낼 수 있기 때문에		
		if(index >= strStudents.length) {
			System.out.println("입력을 모두 마쳤습니다.입력이 중단되었습니다.");
		} else {
			System.out.println("입력이 중단되었습니다.");
		}
		
		System.out.println("index" + index);
		System.out.println("종료");
 */		
		
		return 0;
	}
	
	
	
			
	

	
	
	
	
	
	
	
}//end class
