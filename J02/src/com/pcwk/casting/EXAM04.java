/**
 * package: com.pcwk.casting
 * file name: EXAM04.java
 * description: 변수 두 개를 선언해서 10과 2.0을 대입하고 사칙 연산 결과를 정수로 출력해 보세요.
 * user: HKEDU
 * create date: 2021-09-30
 * version: 0.3
 *
 */
package com.pcwk.casting;

/**
 * @author HKEDU
 *
 */
public class EXAM04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double dNum01 = 2.0;
		int    iNum02 = 10;
		
		//더하기
		System.out.println("(dNum01+iNum02)="+(int)(dNum01+iNum02));
		//빼기
		System.out.println("(dNum01-iNum02)="+(int)(dNum01-iNum02));
		//곱하기
		System.out.println("(dNum01*iNum02)="+(int)(dNum01*iNum02));
		//나누기
		System.out.println("(dNum01/iNum02)="+(int)(dNum01/iNum02));		
	}

}
