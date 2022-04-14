package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

public class StudentServiceV1 {
	
	// protected : 다른 클래스로 상속해줄 준비, 즉 같은 것을 사용하는 것이다.
	protected String[] strStudents;
	protected Scanner scan; //선언만 한 상태
	
	//기본 생성자
	public StudentServiceV1() {
		//strStudents = new String[10];
		//scan = new Scanner(System.in);
		
		//밑의 생성자에게 토스하는 코드이다.
		this(10);
	}
	
	// arg있는 것들은 모두 임의생성자
	// 임의생성자를 만들때는 기본 생성자를 선언해줘야 한다.
	public StudentServiceV1(int length) {
		
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}
	
	public int inputStudent() {
		System.out.println(Line.dLine(50));
		System.out.println(" 학생 이름 입력 ");
		System.out.println(Line.sLine(50));
		for(int i = 0; i < strStudents.length; i++) {
			
			System.out.printf("%d 번 학생 이름 > ", i+1 );
			String strName = scan.nextLine();
			
			strStudents[i] = strName;
			this.printStudent(); // this 는 현재 클래스로, 생략 가능하다.
			System.out.println(Line.sLine(50));
		}
		System.out.println("입력 종료됨~");
		System.out.println(Line.dLine(50));
		return 0;
	}
	
	public void printStudent() {
		
		for(int i=0; i < strStudents.length; i++) {
			boolean bYes = strStudents[i] == null;
			if(bYes) {
				break;
			}
			System.out.printf("** %s\t" , strStudents[i]);
		}
		System.out.println();
		
	}

	
	
	
	
	
	
	
}//end class
