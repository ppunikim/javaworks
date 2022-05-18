package com.callor.app.exec;

public class Exec04 {
	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "B";
		
		//compare
		int comp = str1.compareTo(str2);		//A는 B보다 한 글자 앞이므로		
		System.out.println(comp);				// -1
		
		comp = str2.compareTo(str1);			//B는 A보다 한 글자 뒤이므로
		System.out.println(comp);				// 1
		
		comp = str1.compareTo(str1);			//A 와 A를 비교하는 것이므로
		System.out.println(comp);				//자기 자신끼리는 0
		
		String[] strs = {"F","A","C","B","S"};
		for(String str : strs) {
			System.out.printf("%s\t", str);
		}//end for
		for(int i = 0; i < strs.length; i ++) {
			for(int j = i + 1; j < strs.length; j ++) {
				if(strs[i].compareTo(strs[j]) > 0) {
					String _str = strs[i];
					strs[i] = strs[j];
					strs[j] = _str;
				}//end if
			}//end for(j)
		}//end for(i)
		System.out.println();
		for(String str : strs) {
			System.out.printf("%s\t", str);
		}
	}//end main
}//end class
