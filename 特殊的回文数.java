package ���ű�;

import java.util.Scanner;

/*
 * ����˼·�������ַ�������һ������ȥ����������������������������ǿ���������ص㣬
 * ��Ϊ����λ���������Ļ��������������ǿ��Ը���ǰ��λȷ�������λ������λ�����֣�
 * �������Ҫ�����ÿ��λ����������ֵΪnȻ��������ɡ��ڶ��ַ������ǳ��õķ����ˣ�
 * ����������λ����λ������Ȼ��ȡ������λ����ֵ���ж�����Ƿ���n+�Ƿ��ǻ���������
 * ����Ҫͬʱ���㡣

ԭ�����ӣ�https://blog.csdn.net/kunzhoumei/article/details/86723837
 */
public class ����Ļ����� {
	public static void speicalpalindrome(int n) {
		int x,y,z;
		//�������λ��
		for(int i=1;i<10;i++) {
			x=i;
			for(int j=0;j<10;j++) {
				y=j;
				z=n-2*x-2*y;
				if(z>=0&&z<10) {
					System.out.print(x);
					System.out.print(y);
					System.out.print(z);
					System.out.print(y);
					System.out.print(x);
					System.out.println();

			}
		}
	}
	//�����λ��
	if(n%2==0) {
		for(int i=1;i<10;i++) {
			x=i;
			for(int j=0;j<10;j++) {
				y=j;
				z=n/2-x-y;
				if(z>=0&&z<10) {
					System.out.print(x);
					System.out.print(y);
					System.out.print(z);
					System.out.print(z);
					System.out.print(y);
					System.out.print(x);
					System.out.println();
				}
			}
		}
	}
	
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		speicalpalindrome(n);
		
	}
}
