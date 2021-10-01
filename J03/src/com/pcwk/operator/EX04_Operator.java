/**
 * package: com.pcwk.operator
 * file name: EX04_Operator.java
 * description: 논리 연산자
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
public class EX04_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age01 = 10;
		int age02 = 12;
		
		boolean flag = (age01>0) && ( age02>0);
		//true && true  -> true
		//true && false -> false
		System.out.println("(age01>0) && ( age02 >0):"+flag);
               
		//true && false -> false
		flag = (age01>0) || (age02<0);
		System.out.println("(age01>0) || (age02<0):"+flag);
	
	}

}
//(age01>0) && ( age02 >0):true
//(age01>0) || (age02<0):true