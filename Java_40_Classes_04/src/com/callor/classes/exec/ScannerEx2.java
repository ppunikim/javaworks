package com.callor.classes.exec;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		String fileName = "";
		fileName = "data.txt";
		InputStream is = ScannerEx2.class.getResourceAsStream(fileName);
		
		Scanner scan = new Scanner(is);  
		while(true) {
			boolean bYes = scan.hasNext(); // 다음줄이 있으면 저장하고 콘솔에 보여줘라.
			if(bYes == false) {
				break;
			}//end if
			
			String strLine = scan.nextLine();
			System.out.println(strLine);
			
		}//end while
		
		
		
		
	}//end main
}
