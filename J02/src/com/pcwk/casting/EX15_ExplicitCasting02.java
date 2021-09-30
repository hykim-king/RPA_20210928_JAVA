/**
 * package: com.pcwk.casting
 * file name: EX15_ExplicitCasting02.java
 * description: 연산중 형변환
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
public class EX15_ExplicitCasting02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float  fNum2 = 0.9f;

		//연산중 형 변환: 1       + 0  -> 1
		int iNum3 = (int)dNum1 + (int)fNum2;
		//               1.2 + 0.9 
		int iNum4 = (int)(dNum1 + fNum2);
		
		//(int)double+(int)float:1
		System.out.println("(int)double+(int)float:"+iNum3);
		
		//(int)(double+float):2
		System.out.println("(int)(double+float):"+iNum4);
		
	}

}
