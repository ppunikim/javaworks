package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {
	
	private StudentVO[] stVO;
	private String stFile;
	
//	private StudentServiceImplV1() {
//		
//	}//생성자 : 보통 존재하는데, 임의생성자를 사용하려면 없어야 한다.
	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stVO = new StudentVO[length];
		for(int i=0; i< this.stVO.length; i++) {
			this.stVO[i] = new StudentVO();
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
		}
		
		
	}//end loadStudent

	@Override
	public StudentVO[] getStudents() {
		
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		
		return null;
	}

}
