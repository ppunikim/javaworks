package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {
	
	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan; //Scanner : 키보드로 뭔가를 입력받기 위한 클래스
	
	public ScoreServiceV1() {
		this(10);
	}//기본생성자
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
	}//임의생성자

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("빛나라 고교 성적처리 V1");
		System.out.println(Line.sLine(lineLength));
		
		int index = 0;

		for(index = 0; index < students.length; index++) {
			int stNum = index + 1;
			System.out.printf("%d번 학생 이름(END:중단) : ", stNum);

			String strName = scan.nextLine(); // 키보드에서 문자열 입력받기
			
//			students[index] = strName;  //if 문 위에 있으면 end 라는 문자열을 입력했을 때 그 문자열도 출력 한 후에
			 									//	END 문자열이 if문을 만나 break된다.
			if(strName.equals("END")) { // 중단을 할 수 있도록 만드는 코드
				break;
			}
			students[index] = strName; // if문 밑에 있으면 END 문자열을 작성했을 때 이미 break되고 나가져서 
												// 문자열로 인식하지 않는다.
			
			System.out.printf("%d 번 국어점수 입력 > ", stNum);
			//int intScore = scan.nextInt(); 
			// 정수를 키보드로 입력해 그 값을 정수형 변수 intScore에 담긴다.
			//intKor[index] = intScore; 
			//intScore에 있는 값을 intKor[index]에 저장(할당)하라.
			
			String strScore = scan.nextLine();
			int intScore = 0;
			if(strScore.equals("")) {
				System.out.println("점수는 숫자만 가능 ~~~");
			} else {
				intScore = Integer.valueOf(strScore);
			}
			intKor[index] = intScore;
			
			// Scanner 에서는 nextLine과 nextInt를 같이 사용하면 버그가 일어난다.
		}//end for
		
		return 0;
	}
	
	public void print() {
		for(int i = 0 ; i< students.length; i++ ) {
			System.out.printf("%s \t", students[i]);
		}
		System.out.println();
	}
	
}//end class










