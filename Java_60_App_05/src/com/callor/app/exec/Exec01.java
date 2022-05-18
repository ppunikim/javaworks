package com.callor.app.exec;

import com.callor.utils.Line;

/* 배열, 리스트에 담겨있는데이터들을
 * 어떤 항목, 값을 기준으로 정렬을 할 필요가 많다.
 * DBMS와 같은 데이터 관리 도구를 사용하는 경우는
 * SQL 명령으로 쉽게 정렬할 수 있다.
 * 
 * 하지만, 배열 리스트에 담긴 데이터들은 그 양이 별로
 * 많지 않기 때문에 코딩으로 데이터를 정렬할 수 있다.
 * 
 * insert, bubble, selection, Quick, merge, shell, radix 정렬 알고리즘이 있다.
 * 
 * 간단한 정렬 코드들을 이해하면 쉽게 정렬을 수행할 수 있다.
 * 우리가 수업에서 배운 정렬은 insert정렬, bubble정렬 중간쯤 성능을 갖는 알고리즘이다.
 * 이 알고리즘은 정식 정렬 알고리즘으로 인정받지는 않는다.
 * 
 * 이 정렬의 특징 : 전체 배열이나 리스트를 for()문으로 반복 하면서
 * 0번 위치와 1번~전체 의 위치를 비교( + 순회, 반복)하면서 큰 값은 오른쪽으로, 작은 값은 왼쪽으로
 * 계속 비교해 나간다. 이 때, 작은 값은 빈 공간에 넣어서 왼쪽으로 보내고, 큰 값은 비교를 위해 오른쪽으로 이동한다.
 * -> insert정렬은 0번 - 1~끝번 , 1번 - 0~끝번 등,, 계속 비교한 것이므로, 이것에 비해 더 빠른 느낌이다.
 */
public class Exec01 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int)(Math.random() * 100 ) + 1;
		}//임의의 데이터가 채워진 상태
		for(int num : nums) {
			System.out.printf("%d\t", num);
		}// 데이터 값 출력
		
		// 비교 대상에서 왼쪽에 있는 값의 위치를 지정할 반복문
		for(int i = 0; i < nums.length; i ++ ) {
			for(int j = i + 1 ; j < nums.length; j ++ ) {
				
				// 왼쪽 값이 오른쪽 값보다 크면~?
				if(nums[i] > nums[j]) {	//실행해라.
					int _temp = nums[i]; //nums[i] 값을 temp에 임시로 대피
					nums[i] = nums[j];  // 왼쪽 위치에 오른쪽 위치 값을 저장
					nums[j] = _temp; 	// 임시 대피시킨 값을 비어있는 오른쪽에 넣기
					//이렇게 하면 교환 된다.
				}//end if
			}//end for(j)
		}//end for(i)
		System.out.println();
		System.out.println(Line.dLine(100));
		for(int num : nums) {
			System.out.printf("%d\t", num);
		}
		
		
	}//end main
}//end class

// 한 가지 데이터는 이렇게 하면 된다.