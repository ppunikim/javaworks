package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;
// stList = VO들을 담는 배열(학생들의 배열)
// VO = Value Of (하나의 데이터 리스트, 한 학생 정보를 저장한 변수)
public class StudentServiceImplV1 implements StudentService {
	
	private StudentVO[] stList;
	private String stFile;
	
//	private StudentServiceImplV1() {
//		
//	}//생성자 : 보통 존재하는데, 임의생성자를 사용하려면 없어야 한다.
	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stList = new StudentVO[length];
		for(int i=0; i< this.stList.length; i++) {
			this.stList[i] = new StudentVO();
		}//end for
	}//end 임의생성자
	
	
	@Override
	public void loadStudent() {
		
		InputStream is = null;  // interface의 역할을 한다.
		try {
			is = new FileInputStream(this.stFile);
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println(stFile + "파일을 찾을 수 없습니다.");
			return; //void type이기 때문에 return에 값이 없다.
					// 무조건 실행을 종료하라는 이야기이다.
		}
		Scanner scan = new Scanner(is);
		/*
		while(true) {
			boolean bYes = scan.hasNext();
			if(bYes == false) {
				break;
			}
			String stLine = scan.nextLine();
			System.out.println(stLine);
		}
		*/
		int index = 0; //stList의 요소를 가리키는 값
		while(scan.hasNext()) { // while안에 코드가 true인 동안만 실행해라.
			String stLine = scan.nextLine();
			System.out.println(stLine);
			String[] stInfos = stLine.split(":");
			System.out.println();
			System.out.println("학번:" + stInfos[0]);
			System.out.println("이름:" + stInfos[1]);
			System.out.println("학년:" + stInfos[2]);
			System.out.println("학과:" + stInfos[4]);
			System.out.println("주소:" + stInfos[5]);
			System.out.println();
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
			
			stList[index++] = stVO;
		}//end while 여기를 지나면 stList에 모든 데이터가 담겨있을 것이다.
		this.printStudents();
		
	}//end loadStudent
	
	private void printStudents() {
		// v1 클래스에서 stList에 담긴 데이터를 확인하기 위해
		// 내부용으로 만든 method이다.
		
		for(int i=0; i< stList.length; i++) {
			System.out.println(stList[i].toString());
		}// 1번 방법
		for(StudentVO vo : stList) {
			System.out.println(vo.toString());
		}// 2번 방법
		
	}

	@Override
	public StudentVO[] getStudents() {
		
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		
		return null;
	}

}
