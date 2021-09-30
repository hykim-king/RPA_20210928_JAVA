/**
 * package: com.pcwk.casting
 * file name: EX13_ImplicitConversion.java
 * description: 묵시적 형변환
 * user: HKEDU
 * create date: 2021-09-30
 * version: 0.3
 *
 */
package com.pcwk.casting;

/**
 * @author HKEDU
 *
 */
public class EX13_ImplicitConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//묵시적 형변환: 작은 자료형에서 큰 자료형으로 대입하는 경우(형변환 생략)																				
		byte bNum = 10;
		int  iNum = bNum;
		
		System.out.println("bNum:"+bNum);
		System.out.println("iNum:"+iNum);
		
		//정수와 실수간 묵시적 형변환
		int  iNum02 = 20;
		float fNum  = iNum02;
		
		System.out.println("iNum02="+iNum02);//iNum02=20
		System.out.println("fNum="+fNum);//fNum=20.0
		
		//double =    float + int;  float + float 
		//            20.0 + 10  -> 20.0 + 10.0 -> 30.0
		double dNum = fNum + iNum;
		System.out.println("fNum + iNum="+dNum);
		
		
		
		
		
		
		
		
		
		

	}

}
