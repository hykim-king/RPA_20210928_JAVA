/**
 * package: com.pcwk.operator
 * file name: EX02_Operator.java
 * description: 시칙연산자
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
public class EX02_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore  = 87;
		
		int totalScore = mathScore + engScore;
		
		System.out.println("totalScore:"+totalScore);
		//int/int = int
		System.out.println(totalScore/2);
		
		double avgScore = totalScore/2.0;
		System.out.println("avgScore:"+avgScore);

	}

}
//totalScore:177
//88
//avgScore:88.5
