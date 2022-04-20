package com.callor.classes.exec;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		String fileName = "";
		fileName = "data.txt";
		InputStream is = ScannerEx1.class.getResourceAsStream(fileName);
		//               ---------------------------- => 컴파일된 .class파일에서 resource를 가져와라
		//                                           --------- => 스트림으로 변환해라.
		//                                                   ----------- => 이것을.
		
		Scanner scan = new Scanner(is);  // 키보드와 연결하는 것이 아니라, 파일 정보를 가져오는 것이다.
		String strLine= scan.nextLine();
		
		System.out.println(strLine);
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		
	}
}
