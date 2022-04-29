package com.callor.app.exec.model;

public class ScoreVO {
	
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	
	
	
	public ScoreVO(int intKor, int intEng, int intMath) {
		super();
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
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
		return "StudentVO [intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + ", getIntKor()="
				+ getIntKor() + ", getIntEng()=" + getIntEng() + ", getIntMath()=" + getIntMath() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
