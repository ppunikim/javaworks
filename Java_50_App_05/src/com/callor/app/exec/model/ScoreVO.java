package com.callor.app.exec.model;

public class ScoreVO {
	private int stNum = 0;
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	
	
	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + "]";
	}
	
	

}
