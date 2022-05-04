package com.callor.alone.array;

import java.util.ArrayList;
import java.util.List;

import com.callor.alone.model.StudentVO;
import com.callor.utils.Line;


public class Array2 {
	public static void main(String[] args) {

	List<Integer> nums1 = new ArrayList<Integer>();
	List<Float> nums2  = new ArrayList<Float>();
	
	nums1.add(10); // nums1 배열의 0번째에 있는 것
	nums1.add(2); // nums1 배열의 1번째 있는 것
	nums2.add((float)20);
	nums2.add((float)40.2);
	
	int num0 = nums1.get(0);
	System.out.println(num0);
	num0 = nums1.get(1);
	System.out.println(nums1.get(1));
	
	
	System.out.println(Line.dLine(20));
	for(int i = 0; i < nums1.size(); i ++) {
		System.out.println(nums1.get(i));
	}// size() 는 nums1 사이즈만큼 get(): 가져오는 것이다.
	// 하지만 이 코드는 size만큼 for문이 돌때마다 실행되므로, 비효율적인 코드이다.
	
	
	System.out.println(Line.dLine(20));
	int size = nums2.size();
	for(int i = 0; i < size; i ++) {
		Float num = nums2.get(i);
		System.out.println(num);
	}
	
	
	System.out.println(Line.dLine(20));
	for(Integer num : nums1) {
		System.out.println(num);
	}
	
	System.out.println(Line.sLine(20));
	for(Float num2 : nums2) {
		System.out.println(num2);
	}
	
	
	System.out.println(Line.sLine(20));
	System.out.println(Line.sLine(20));
	System.out.println(Line.sLine(20));
	List<StudentVO> stList = new ArrayList<>(); // 학생들의 리스트를 만드는 것
	for(int i = 0 ; i < 10 ; i ++) {
		StudentVO stVO = new StudentVO(); // 학생 한명의 리스트를 만드는 것
		
		String strNum = String.format("%5d",i+1);  // String.format은 printf와 같은 역할을 한다.
		
		int intNum = (int)(Math.random() * 50) + 51;
		int intGrade = (intNum % 4) + 1; // 학년 구하기:
										//  100을 4로 나눈 나머지( 0 ~ 3) 에서 1을 더해 (1 ~ 4)가 나온다.
		String strGrade = intGrade + ""; // 숫자를 문자열로 바꾼 것 : VO 클래스에서 String으로 만들어서.
		
		stVO.setStNum(strNum);
		stVO.setStGrade(strGrade);
		stList.add(stVO);
		
		
	}//end for
	
	
	
	}//end main
}//end class



































