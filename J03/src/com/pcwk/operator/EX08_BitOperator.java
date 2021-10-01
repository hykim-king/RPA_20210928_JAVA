/**
 * package: com.pcwk.operator
 * file name: EX08_BitOperator.java
 * description:비트 논리 연산자	: ^,~	
 * user: HKEDU
 * create date: 2021-10-01
 * version: 0.3
 *
 */
package com.pcwk.operator;

/**
 * @author HKEDU
 *
 */
public class EX08_BitOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  ^(XOR) 연산자: 두 비트가 다른 경우 1, 그렇치 않으면 0		
		//			0	0	0	0	0	1	0	1
		//		^	0	0	0	0	1	0	1	0
		//=======================================
		//	 		0   0   0   0   1   1   1   1		

		int num1 = 5;
		int num2 = 10;
		
		int result = num1 ^ num2;
		System.out.println("num1 ^ num2->"+result);//num1 ^ num2->15
//      세로편집: alt+shift+a		
//		~(반전) 연산자													
//		비트 값을 0은 1로, 1은 0으로 바꾸는 연산자.												
//		부호화 비트 바꾼다.												
		//		~	0	0	0	0	1	0	1	0
		//=======================================		
		//          1   1	1   1   0   1   0   1  	
		
		result = ~num2;
		//~num2->-11 + 1
		//
		System.out.println("~num2->"+~num2);//num1 ^ num2->15
		
		
	}

}
