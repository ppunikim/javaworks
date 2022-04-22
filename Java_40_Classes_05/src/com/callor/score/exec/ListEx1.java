package com.callor.score.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		
		List<Integer> nums1 = new ArrayList<Integer>(); //지금까지는 개수가 0인 정수형배열이다.
		List<Float> nums2 = new LinkedList<Float>();
		// 이 두개는 같은데 안에서 저장하는 방식이 다르다.
		// 데이터를 저장하는 것이 아니라 추가를 해야한다.
		
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		//nums1에서 3개의 요소를 가지는 List가 된다.
		
		int num0 = nums1.get(0);
		System.out.println(num0);
		
		System.out.println(nums1.get(1));
		System.out.println(nums1.get(2));
		//System.out.println(nums1.get(3));   현재 3개의 데이터(0~2)만 추가되어서, 
		// 														3번째는 get할수 없다.
		
		int intSize = nums1.size();
		for(int i=0; i< intSize; i++) { // size method는 
			Integer num = nums1.get(i);
			System.out.println(num);
		}
		/* length가 아닌 size로 list의 배열을 가져올 수 있다.
		 * 위 코드에서는  nums1.size()는 nums1의 요소 개수만큼 반복하여 호출실행된다.
		 * 이는 비 효율적인 코드이므로
		 * size값을 for() 명령 이전에 변수에 담아두고 시작하자.
		 */
		for(Integer num : nums1) {
			System.out.println(num);
		}// 위 for문과 같은 일을 한다.
	
	
	}//end main
}//end class
