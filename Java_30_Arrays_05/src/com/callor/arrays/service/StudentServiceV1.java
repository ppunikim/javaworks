package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

public class StudentServiceV1 {
	
	// 클래스 변수의 접근제한자를 protected로 변경
	// protected : 다른 클래스로 상속해줄 준비, 즉 같은 것을 사용하는 것이다.
	protected String[] strStudents;
	protected Scanner scan; //선언만 한 상태
	
	//기본 생성자
	public StudentServiceV1() {
		//strStudents = new String[10];
		//scan = new Scanner(System.in);
		
		//원래는 기본생성자도 초기화하는 코드가 필요하지만 임의생성자가 있으면
		//밑의 생성자에게 토스를 해 기본 생성자의 역할을 떠넘기는 것으로 만들 수 있다.
		this(10);
	}
	
	// argument 에 있는 것들은 모두 임의생성자
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
