package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/* data.txt 파일의 내용을
 * console에 한 라인으로 출력하시오.
 * 방법 1 :  scanner 사용
 */
public class Exec08 {
	public static void main(String[] args) {

		String filename = "src/com/callor/app/exec/date.txt";			
		/* file과 관련된 클래스는
 		 * 객체 선언문과 생성(초기화)를 분리한다.
 		 * try,catch 로 인해!
		 */
		InputStream is = null; 
		Scanner scan = null;
		
		try {
			is = new FileInputStream(filename); // 파일 이름을 찾아서 입력값 is에 담아라  
			scan = new Scanner(is);
			
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end main
}
