package com.callor.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class E47 {
	public static void main(String[] args) {
		String fileName = "src/com/callor/app/file.txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(fileName);
			scan = new Scanner(is);
			while(scan.hasNext()) {		//읽을 것이 있는지
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
