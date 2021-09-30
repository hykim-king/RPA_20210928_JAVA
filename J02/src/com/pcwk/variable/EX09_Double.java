/**
 * package: com.pcwk.variable
 * file name: EX09_Double.java
 * description: 부동 소수점의 오차
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
public class EX09_Double {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double dNum = 1;
		
		for(int i=0;i<10000;i++) {
			dNum= dNum+0.1;
			//System.out.println(dNum);
		}//--for 
		//1001이 예상 그러나
		//1001.000000000159이 출력되서 소수점이하 만큼 오차 발생.
		//오차가 발생하지만 더 넓은 범위의 실수 값 표현을 위해 사용.
		System.out.println("dNum:"+dNum);
		
		
	}

}
