package ���ű�;

import java.util.Scanner;

public class ʮ������תʮ���� {
	public static void main(String[] args) {
		//����Scanner����м�������
				Scanner scanf = new Scanner(System.in);
					//ʹ�ü��������ַ���
				String str = scanf.next();
				//����ת��
				System.out.println(H_Change_D(str));
	}
	
	//16ת10
	public static long H_Change_D(String str) {
		//���÷��ؽ��ܵı���
		long DEC = 0l;
		//���õ����ַ��Ķ�Ӧ����
		int one = 0;
		int j = str.length()-1;
		//�ַ���תΪ�ַ�������ڱ���
		char[] chararr = str.toCharArray();
		
		for(int i = 0;i < str.length();i++) {
			//�ж�Ϊ�����ַ�ʱ�����
			if('0' <= chararr[i] && chararr[i] <= '9')
				one = (int) (chararr[i] - '0');
			//�ж�Ϊ��ĸ�ַ�ʱ�����
			if('A' <= chararr[i] && chararr[i] <= 'F') 
				one = (int) (chararr[i] - 'A' + 10);
			//�����ۼ���͵ó�ʮ������ת��ʮ���Ƶ���
			DEC = (long) (DEC + one*Math.pow(16, j));
			j--;
		}
		return DEC;
	}	
	
	
}
