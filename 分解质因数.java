package ���ű�;

import java.util.Scanner;

public class �ֽ������� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//���������ֽ�����½���
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		
		//���α���ѭ���ҵ�����
		for(;a <= b;a++) {
			//��Ϊ����ֱ�����
			if(find(a) == 1) {
				System.out.println(a + "=" + a);
			}
			//���������ʽ�ֽⷽ������
			else {
				chai(a);
			}
		}
	}
	//����Ѱ�ҷ���
	static int find(int x) {
		int y = x;
		for(x=x-1;x>1;x--) {
			if(y % x == 0)
				break;
		}
		if(x == 1)
			return 1;
		else
			return 0;
	}
	//��ʽ�ֽⷽ��
	static void chai(int x) {
		int[] num = new int[100];
		int i = 0;
		int k = 2;
		int y=x;
		while(x != 0 && x != 1) {
			if(x % k != 0) {
				k++;
				continue;
			}
			else {
				num[i] = k;
				i++;
				x=x/k;
			}
		}
		System.out.print(y+"=");
		for(int j = 0;j <= i;j++) {
			if(j == i-1) {
				System.out.print(num[j]);
				break;
			}
			System.out.print(num[j]+"*");
		}
		if(x != 0 && x != 1)
			System.out.print("*"+x+"\n");
		else
			System.out.print("\n");
	}
}
