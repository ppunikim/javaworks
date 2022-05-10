package com.callor.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {
	
	private String tKey; // ID에 해당하는 칼럼
	private String tContent; // 할일 내용
	private String sDate; // 추가(시작)날짜
	private String sTime; // 추가(시작)시간
	
	private String eDate; //끝난(완료)날짜
	private String eTime; // 끝난(완료)시간
	
	private boolean bComp; // 완료 여부(True, False)
	
	@Override
	public String toString() {
		String result = String.format("%s", tKey);
		result += String.format("%s\t",sDate);
		result += String.format("%s\t",sTime);
		
		// 3항 연산이라고 부른다. 
		String compStr = eDate == null || eDate.isEmpty() ? "진행중" : "완료됨";   
					// eDate에 값이 null이면 진행중이라는 값을 compStr에 저장하고, 
					// eDate 값이 "" 이면 완료됨을 compStr에 저장해라.

/* 		compStr = eDate.isEmpty() ? "진행중" : "완료됨";        // 위에것과 같은 의미 1
 */
		
/*		if(eDate.isEmpty()) {                                   // 위에것과 같은 의미 2
			compStr = "진행중"; 
		} else { 
			compStr = "완료됨";
		}
*/		
		//result += String.format("%s",tContent);
		
		result += String.format("%s\t",eDate);
		result += String.format("%s\t",eTime);
		
		return result;
		
	}
	

}//end class
