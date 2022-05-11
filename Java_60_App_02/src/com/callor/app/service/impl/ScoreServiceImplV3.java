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
		/*
		 * BufferOutput을 사용하는 이유
		 * 실제 데이터를 파일에 기록하기 위해서는 FileOutputStream 만
		 * 있어도 된다.
		 * 하지만, 파일에 기록하고 저장하는 일은 상당히 많은 시간을 소모한다
		 * 컴퓨터 메모리, CPU 입장에서는 파일을 기록하는 동안
		 * 아무것도 하지 못하고 기다려여 하는 상황이 발생한다
		 * 
		 * 이때 중간에 BuffereOutput 라는 파이프를 연결해 두고
		 * 애플리케이션에서는 BuffereOutput 에게 데이터를 모두 보내고
		 * 다른 일을 수행한다
		 * 
		 * 그러면 BufferedOutput 와 FileOutput 가 협력하여 데이터를
		 * 파일에 기록하는 일을 대신 수행해준다
		 */
		
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
