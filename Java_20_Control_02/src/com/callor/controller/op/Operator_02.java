package com.callor.controller.op;

public class Operator_02 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		System.out.println(intNum1 += 10 ); // intNum1 = intNum1+ 10;
		
		System.out.println( (intNum1 += 10) > 10 ); // intNum1 = intNum1+10 > 10
		
		System.out.println( 
				
				((intNum1 += 10) > 20) ||  // intNum1 = intNum1 + 10 > 20 ||
				((intNum2 += 10) > 10)
				);
		
		System.out.println(intNum1);
		System.out.println(intNum2); //필요없는 코드는 실행하지 않기 때문에. 
		//앞에서 t가 나와 ||로 바로 출력돼서 밑에 코드는 보지도 않고 출력된다.
		
		//intNum1 = 30 이고, intNum2 = 0 
		
		
		System.out.println( 
				((intNum1 += 10) < 20) &&
				((intNum2 += 10) > 10) // 결국 이 코드는 앞이 false이므로 필요없는 코드이다.
				); 
		//앞이 false이므로 and연산은 뒤에것을 실행하지않고 바로 끝내버린다. 
		//intNum1 = 40 이고, intNum2 = 0 
		
		/*
		 * Short-circuit Evaluation(SCE)
		 * 최적화된 단축 평가 값.
		 * 연산의 효율을 높이기 위해 불필요한 연산은 하지 않는다.
		 * || 나 && 가 수행되면 두 개의 논리연산식이 실행되는데, 두 개의 논리연산의 결과를 or연산하여 console에 출력한다.
		 * 그 결과는 true 나 false 가 나오는데 
		 * ||(or)연산에서 앞에값이 true가 나오면 뒤에것은 보지않고 바로 true를 출력한다. 
		 * &&(and)연산에서 앞에값이 false가 나오면 뒤에것은 보지않고 바로 false를 출력한다. 
		 *따라서 뒤에 나오는 코드는 필요없는 코드로 인식하며 출력하지 않는다.
		 */
				
		
		
		
		
		
		
		
		
		
		
	}

}
