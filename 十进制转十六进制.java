package ���ű�;

import java.util.Scanner;

//ʮ����תʮ������
public class ʮ����תʮ������ {
	public static void tentosixteen(int number) {
		int remainder=number%16;     //����
		int quotient=number/16;          //��
		StringBuilder sixteen=new StringBuilder();
		while(quotient!=0){          //��Ҫ������ɳ�kȡ��Ĺ���
			getParament(remainder,sixteen);
			remainder=quotient%16;
			quotient=quotient/16;
		}
		getParament(remainder,sixteen);    //ע�⣡��quotientΪ0ʱ;���ǻ�Ҫ����һ�ε�remainder���뵽sixteen�ַ����С�
		int len=sixteen.length();
		for(int i=0;i<len;i++) {                       //��������ַ���
			System.out.print(sixteen.charAt(len-i-1));
		}
		
	}
	public static void getParament(int remainder,StringBuilder sixteen) {
		switch (remainder) {     //����ڶ����ط���Ҫ�õ��������Ұ�����װ���˺���
			case 10:sixteen.append('A');break;
			case 11:sixteen.append('B');break;
			case 12:sixteen.append('C');break;
			case 13:sixteen.append('D');break;
			case 14:sixteen.append('E');break;
			case 15:sixteen.append('F');break;
			default:sixteen.append(remainder);break;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int ten=scanner.nextInt();
		tentosixteen(ten);
	}
}
