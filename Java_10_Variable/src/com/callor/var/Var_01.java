/*pacage는 ?
 * : Var_01.java파일이 src/com/callor/var 폴더에 저장되어 있다는 표식
 * 
 */

package com.callor.var;


//class선언문, class prototype
public class Var_01 {
	
	//여기서부터 실제 명령문 코드 작성됨
	public static void main(String[] args) {

		
		
		//코드에서 사용되는 수의 체계 : 정수(소수점x), 실수<소수점o)
		//정수형 (int type), 실수형(float type)

		int num1 =112;
		int num2 =34;
		/*
		 * int => 정수형 데이터를 저장할 기억장소를 예약해달라
		 * num1 => 예약한 기억장소에 쉬운 num1이라는 이름을 붙여라
		 * =30 => 예약된 num1 기억장소에 30을 할당(저장)해라
		 * 
		 * 정수형 변수 num1 을 선언하고 정수 112값으로 초기화 하라.
		 
		 */
		 
		
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num1 - num2);
		System.out.println(num2 / num1);
		System.out.println(40.0 / 30.0);
		//이것들은 총 9개의 기억장치를 사용한다.
	
		int num3;
		int num4;
		//정수형 변수 num3,num4를 선언 "만"하기
		
		    num3=40;
		    num4=100;
		    //선언된 정수형 변수 num3에 정수 40을 대입(할당, 저장)
        
		/*
		 * 선언만 된 변수에서는 값을 읽을 수 없으므로 반드시 앞에서 
		 * 어떤 값이라도 저장,할당을 해야만 이후에 읽을 수 있다.
		 */    
		System.out.println(num3 + num4);
		
		int num5 =0;
		System.out.println(num5);
		/*
		 * 변수에 어떤 값을 저장해야할지 아직 정해지지 않았을때
		 *  숫자일 경우에는 0으로 초기화를 해둔다.
		 */

		int intNum1 =0;
		/* 변수 명명 규칙과 패턴
		 * 1. 첫 글자는 무조건 소문자
		 * 2. 이후에는 대소문,숫자,_를 조합할 수 있다.
		 * 3. 두개이상의 단어를 조합하여 만드는 것이 좋다.
		 * 4. 두개 이상의 단어를 조합할 때 두번째 단어는 대문자로 적으면 좋다.
		      => camel case
		 * 5. 두개 이상의 단어를 조합할 때 첫 번째 단어는 변수의 type 로 만드는 것이 좋다. 
		 *    =>헝가리언 표기법 
		 * 6. 좋은 변수 이름 짓기 : 변수명만 보고 2개 이상의 단어를 조합하자. 그러므로
		 * 변수명만 보고 어떤 데이터가 담겨있는지 유추할 수 있도록 하자.
		 **/
		
         System.out.println(intNum1);		
	}

}
