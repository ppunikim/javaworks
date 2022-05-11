package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor // 모든 변수를 매개변수로 갖는 임의생성자
@NoArgsConstructor  // 기본 생성자(임의 생성자 만들면 있어야 한다.)
@Builder
public class StudentVO {
	
	private String stNum;
	private String stName;
	private String stTel;
	private String stAddr;
	private String stDept;
	private int stGrade;

}
// getter, setter, 생성자 모두 만드는 방법이다. 이것은 lombok 할 때 가능하다.