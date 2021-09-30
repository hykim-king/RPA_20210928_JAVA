/**
 * package: com.pcwk.variable
 * file name: EX11_Constant.java
 * description: »ó¼ö(constant)
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
public class EX11_Constant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		System.out.println("MAX_NUM:"+MAX_NUM);
		
		MIN_NUM = 1;
		
		System.out.println("MIN_NUM:"+MIN_NUM);
		//Description	Resource	Path	Location	Type
		//The final local variable MAX_NUM cannot be assigned. It must be blank and not using a compound assignment	EX11_Constant.java	/J02/src/com/pcwk/variable	line 25	Java Problem

		//MAX_NUM = 777;
		System.out.println("MAX_NUM:"+MAX_NUM);
		
		//MIN_NUM = 0;
	}

}
