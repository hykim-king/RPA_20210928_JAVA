/**
 * package: com.pcwk.casting
 * file name: EX14_ExplicitCasting.java
 * description: ����� ����ȯ
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
//		����� ����ȯ: ������ �� ��ȯ�� �ݴ�																					
//		��ȯ �Ǵ� �ڷ����� ����ؾ���(�ڷ��� �ս��� �߻� �Ҽ� ����)																	
        int iNum = 11;
        byte bNum = (byte)iNum;
        
        System.out.println("iNum="+iNum);
        System.out.println("bNum="+bNum);
        //byte : -128 ~ 127
        int iNum01  = 1000;
        byte bNum01 = (byte) iNum01;
        
        System.out.println("iNum01:"+iNum01);
        System.out.println("bNum01:"+bNum01);//������ �� : �м� ���ʿ�.
        
        
        //�� ������ �ڷῡ�� �� ������ �ڷ�� ����
        double dNum = 3.14;
        int    iNum02 = (int) dNum;
        
        System.out.println("dNum:"+dNum);//3.14
        System.out.println("iNum02:"+iNum02);//3
        
	}

}
