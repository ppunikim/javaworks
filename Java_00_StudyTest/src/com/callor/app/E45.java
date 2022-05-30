package com.callor.app;

public class E45 {
	public static void main(String[] args) {
		
	int[] nums = new int[100];
	for(int i = 0; i < nums.length; i ++) {
		nums[i] = (int)(Math.random() * 100) + 1;
	}
	for(int j = 0; j < nums.length; j ++) {
		int index = 0;			//갯수를 세기 위해 0을 먼저 초기화 해 준 것이다.
		for(index = 2; index < nums.length; index ++) {
			if(nums[j] % index == 0) {
				break;
			} 
		}//end for
		
		if(nums[j] <= index) {		// <= 는 작거나 같으면 이라는 의미이다.
			System.out.println("소수의 값 : " + nums[j]);
		} else if (nums[j] == 1) {
			System.out.println("1 은 소수가 아니다.");
		} else {
			System.out.printf("%d 는 소수가 아니다.\n", nums[j]);
		}
	}
		
	
	
	}//end main
}
