/**
 * package: com.pcwk.operator
 * file name: EX03_Operator.java
 * description: 증가 감소 연산자.
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
public class EX03_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int gameScore = 150;

		//gameScore=gameScore+1;
		int lastScore01 = ++gameScore;//gameScore에 1증가 시키고 할당
		System.out.println("lastScore01:"+lastScore01);
		
		int lastScore02 = --gameScore;//gameScore에 1감소 시키고 할당
		System.out.println("lastScore02:"+lastScore02);
		
		//----------------------------------------------
		//lastScore02:150
		int lastScore03 = gameScore++;
		System.out.println("lastScore03:"+lastScore03);
		
		//gameScore:151
		System.out.println("gameScore:"+gameScore);

        int lastScore04 = gameScore--;
        System.out.println("lastScore04:"+lastScore04);
        System.out.println("gameScore:"+gameScore);
        
        //----------------------------------------------
        //관계연산자
        int myAge = 23;
        boolean  value = (myAge > 20);
        System.out.println("value:"+value);
        
	}

}
//lastScore01:151
//lastScore02:150
//lastScore03:150
//gameScore:151
//lastScore04:151
//gameScore:150