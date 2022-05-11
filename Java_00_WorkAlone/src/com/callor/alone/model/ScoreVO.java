package com.callor.alone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ScoreVO {
	
	protected int stNum;
	protected int intKor;
	protected int intEng;
	protected int intMath;
	protected int intSum;
	protected float fAvg;
}
