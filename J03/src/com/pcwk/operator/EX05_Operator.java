/**
 * package: com.pcwk.operator
 * file name: EX05_Operator.java
 * description: 
 * 단락회로평가																				
	논리 곱(&&)은 두 항이 모두 true일 때만 결과가 true																			
	-> 앞 항이 false이면 뒤 항의 결과를 평가 하지 않는다.																			
																				
	논리합(||)은 두 항이 모두 false 일 때만 결과가 false																			
	-> 앞 항이 true이면 뒤 항의 결과를 평가 하지 않는다.(수행하지 않는다.)																			

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
public class EX05_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int i    = 2;
		
		boolean value = ((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println("value: "+value);//value: false
		System.out.println("num1: "+num1);//num1: 20
		System.out.println("i: "+i);//i: 2
		
		value = ((num1 = num1 + 10)>20) || ((i=i+2)<10);
		System.out.println("value: "+value);//value: true
		System.out.println("num1: "+num1);//num1: 30
		System.out.println("i: "+i);//i: 2		
		
	}

}
