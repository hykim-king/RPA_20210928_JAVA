/**
 * package: com.pcwk.operator
 * file name: EX09_BitShift.java
 * description:비트 이동 연산자(shift연산자)																		
		<<(좌 shift)							
		비트를 왼쪽으로 이동						

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
public class EX09_BitShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// <<2
		// 0 0 0 0 0 0 1 0 1
		// ==================
		// 0 0 0 0 1 0 1 0 0

		int num1 = 5;
		int result = num1 << 2;
		System.out.println("num1 << 2: " + result);
		// >>2
		// 0 0 0 0 1 0 1 0
		// ==================
		// 0 0 0 0 0 0 1 0

		int num2 = 10;
		result = num2 >> 2;
		System.out.println("num2 >> 2: " + result);
		System.out.println(10 / 4);

	}

}
