/**
 * package: com.pcwk.variable
 * file name: EX07_Char.java
 * description: char ����, �����ڵ�
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
public class EX07_Char {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =  65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = b;//�����ڵ�� ������ ����.
		
		System.out.println("(char)a:"+(char)a);//(char)a:A
		System.out.println("a2:"+a2);//a2:A
		System.out.println((char)b);//? char �ڵ忡 ������ �����Ƿ� ?ǥ��
	}

}
