/**
 * package: com.pcwk.variable
 * file name: EX02_ByteShort.java
 * user: HKEDU
 * create date: 2021-09-30
 * version: 0.3
 *
 */
package com.pcwk.variable;

/**
 * @author HKEDU
 *
 */
public class EX02_ByteShort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//자료형이 서로 다른 정수 끼리 더하기
		short sVal = 10;
		byte  bVal = 20;
		//정수에 연산시 기본 타입은 int
		//두 정수 모두 int로 변환 되어 연산됨.
		//그 결과 또한 int
		System.out.println(sVal+bVal);

	}

}
