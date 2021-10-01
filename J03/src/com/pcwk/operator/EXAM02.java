/**
 * package: com.pcwk.operator
 * file name: EXAM02.java
 * description:
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
public class EXAM02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Q2
		int num;
		num = -5+ 3*10/2;
		System.out.println(num);

		System.out.println("Q3==========================");
		
		//Q3
		num = 10;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
		System.out.println("Q4==========================");
		//Q4
		int num1 = 10;
		int num2 = 20;
		
		boolean result ;
		result = ((num1>10) && ( num2>10));
		System.out.println(result);
		
		
		result = ((num1>10) || ( num2>10));
		System.out.println(result);
		
		System.out.println(!result);
		
		
		System.out.println("Q5==========================");
		//Q5	
		num1 = 2;
		num2 = 10;
		
		System.out.println("num1 & num2 ->"+(num1 & num2));
		System.out.println("num1 | num2 ->"+(num1 | num2));
		System.out.println("num1 ^ num2 ->"+(num1 ^ num2));
		System.out.println("~num1 ->"+(~num1));//1의 보수
		System.out.println("~num1 ->"+(~num1 +1));//1의 보수 + 1 -> 음수
		
		System.out.println("Q6==========================");
		//Q6
		num = 8;
		//num=num+10  --> 18
		System.out.println(num+=10);
		//num=num-10  --> 8
		System.out.println(num-=10);
		//num=num>>2  --> 2
		//System.out.println(8/4);
		System.out.println(num>>=2);
		
		System.out.println("Q7==========================");
		//Q7		
		num = 10;
		num2 = 20;
		
		int resultNum = (num >=10)?num2+10:num2-10;
		System.out.println("resultNum:"+resultNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
