/**
 * package: com.pcwk.variable
 * file name: EX09_Double.java
 * description: �ε� �Ҽ����� ����
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
		//1001�� ���� �׷���
		//1001.000000000159�� ��µǼ� �Ҽ������� ��ŭ ���� �߻�.
		//������ �߻������� �� ���� ������ �Ǽ� �� ǥ���� ���� ���.
		System.out.println("dNum:"+dNum);
		
		
	}

}
