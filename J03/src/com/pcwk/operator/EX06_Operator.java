/**
 * package: com.pcwk.operator
 * file name: EX06_Operator.java
 * description:조건 연산자(삼항 연산자)															
	삼항 연산자														
	조건식의 결과가 true/false에 따라 다른 결과가 수행됨.														
	제어문 중 조건문을 간략히 표현.														

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
public class EX06_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fatherAge = 23;
		int motherAge = 19;
		
		char ch =' ';//char ch='';문자가 없으므로 오류  -> ''->' '
		ch = (fatherAge>motherAge)?'T':'F';
		
		System.out.println("ch="+ch);
     
		//------1분 review
		int num = 9;
		boolean isEven;
		
		isEven = (num%2==0)?true:false;
		
		System.out.println("(num%2==0)?true:false=>"+isEven);
		
	}

}
