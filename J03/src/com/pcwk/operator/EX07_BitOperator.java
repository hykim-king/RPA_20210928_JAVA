/**
 * package: com.pcwk.operator
 * file name: EX07_BitOperator.java
 * description:비트 논리 연산자	: &연산자(둘다 1인 경우 1),|			
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
public class EX07_BitOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//  &(and) 연산자: 두 비트가 모두 1인 경우 1, 그렇치 않으면 0		
//		0	0	0	0	0	1	0	1
//	&	0	0	0	0	1	0	1	0
//=======================================
// 		0   0   0   0   0   0   0   0
		
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2;
		System.out.println("num1 & num2="+result);
//  |(or) 연산자: 둘중 하나가 1인 경우 1, 그렇치 않으면 0		
//		0	0	0	0	0	1	0	1
//	|	0	0	0	0	1	0	1	0
//========================================		
//		0	0	0	0	1	1	1	1
		
		result = num1 | num2;
		System.out.println("num1 | num2="+result);

	}

}
