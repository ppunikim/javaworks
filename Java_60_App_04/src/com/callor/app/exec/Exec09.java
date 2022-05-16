package com.callor.app.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* data.txt 파일의 내용을
 * console에 한 라인으로 출력하시오.
 * 방법 2 : buffer 사용
 */
public class Exec09 {
	public static void main(String[] args) {
		
		List<String> strLines = new ArrayList<>();
		String fileName = "src/com/callor/app/exec/date.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);  //내용 출력하는 것.(확장 for문 사용하지 않아도 된다.)
			}//end while
			
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}// end try/catch
		
	}//end main
}//end class
