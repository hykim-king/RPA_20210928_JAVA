/**
 * package: com.pcwk.variable
 * file name: EX04_Char.java
 * description: char 설명
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
public class EX04_Char {

	public static void main(String []args) {
		char ch01 = 'A';
		System.out.println("ch01:"+ch01);//문자 출력 -> ch01:A
		System.out.println("(int)ch01:"+(int)ch01);//문자에 해당하는 아스키 코드값 출력 -> (int)ch01:65
		
		char ch02 = 66;//정수값 대입(할당)
		System.out.println("ch02:"+ch02);//ch02:B
		
		char ch03 = 67;
		System.out.println("ch03:"+ch03);//ch03:C
		System.out.println("(char)ch03:"+(char)ch03);//(char)ch03:C
	}
}




