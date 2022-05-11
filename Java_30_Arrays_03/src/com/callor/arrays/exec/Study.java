package com.callor.arrays.exec;

public class Study {
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		for(int i=0; i<intNum.length; i++) {
			intNum[i] = (int)(Math.random()*100)+1;
		}
		
		//각 배열에 저장된 수 중, 짝수가 몇개인지?
		int intEvenNum = 0;
		for(int i=0; i<intNum.length; i++) {
			boolean bEven = (intNum[i] % 2 == 0);
			if(bEven == true) {
				// 짝수의 갯수를 새는 것
				intEvenNum++;
<<<<<<< HEAD
			}
		}
		System.out.println(intEvenNum);
=======
			}// end if
		}//end for
		System.out.println(intEvenNum);
		
>>>>>>> 24bc4adcde48bd07270ae60f71cf5a115a0f76d9
		System.out.println("================================");
		
		//각 배열에 저장된 짝수의 값을 모두 더한 것은 얼마?
		int intEvenSum = 0;
		for(int i=0; i<intNum.length; i++) {
			boolean bEven = (intNum[i] % 2 == 0);
			if(bEven == true) {
				intEvenSum += intNum[i];
<<<<<<< HEAD
			}
		}
		System.out.println(intEvenSum);
=======
			}//end if
		}//end for
		System.out.println(intEvenSum);
		
>>>>>>> 24bc4adcde48bd07270ae60f71cf5a115a0f76d9
	}//end main
	
}//end class
