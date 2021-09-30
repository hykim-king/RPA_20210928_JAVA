/**
 * package: com.pcwk.casting
 * file name: EX14_ExplicitCasting.java
 * description: 명시적 형변환
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
public class EX14_ExplicitCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		명시적 형변환: 묵시적 형 변환의 반대																					
//		변환 되는 자료형을 명시해야함(자료의 손실이 발생 할수 있음)																	
        int iNum = 11;
        byte bNum = (byte)iNum;
        
        System.out.println("iNum="+iNum);
        System.out.println("bNum="+bNum);
        //byte : -128 ~ 127
        int iNum01  = 1000;
        byte bNum01 = (byte) iNum01;
        
        System.out.println("iNum01:"+iNum01);
        System.out.println("bNum01:"+bNum01);//쓰래기 값 : 분석 불필요.
        
        
        //더 정밀한 자료에서 덜 정밀한 자료로 대입
        double dNum = 3.14;
        int    iNum02 = (int) dNum;
        
        System.out.println("dNum:"+dNum);//3.14
        System.out.println("iNum02:"+iNum02);//3
        
	}

}
