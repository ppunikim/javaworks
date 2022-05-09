package com.callor.app.service.impl;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.callor.app.model.ScoreVO;

/*
 * extends : class 상속
 * implements : interface 상속
 */
public class ScoreServiceImplV3 extends ScoreServiceImplV2 {
	
	protected String saveFileName;
	public ScoreServiceImplV3() {
		super();
		saveFileName = "src/com/callor/app/controller/Score.txt";
	}// 기본 생성자에다가 이전 클래스 가져오기
	
	@Override
	public void saveScore() {
		
		// 파일 데이터를 기록하는데 사용하는 도구
		FileOutputStream fileOut = null;
		BufferedOutputStream buffer = null;   //중간에서 메모리 저장역할
		
		// 파일 입출력 관련 애들은 try / catch로 항상 묶어줘야 한다.
		try {
			fileOut = new FileOutputStream(saveFileName);
			buffer = new BufferedOutputStream(fileOut);  //위에 친구와 같이 데이터를 협력해서 저장하는 것이다.
			// buffer는 사진이미지지와 같이 무거운 것을 가져오는데 사용하는 것이다.
			for(ScoreVO scVO : scList) {
				String writeStr = "";
				writeStr += String.format("%s:", scVO.getStName());
				writeStr += String.format("%d:", scVO.getStKor());
				writeStr += String.format("%d:", scVO.getStEng());
				writeStr += String.format("%d\n", scVO.getStMath());
				buffer.write(writeStr.getBytes());
			}//end for
			buffer.flush(); // 줄 데이터 다 줬으니 알아서 처리해라.
			buffer.close(); // 버퍼의 역할을 끝내라.
			fileOut.close(); // 파일 역할도 끝내라
			// 이 세줄을 쓰지 않으면 아무리 코드 작성을 해도 데이터가 날아간다. 중요코드.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}//end try/catch
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}//상속받아옴.
}
