package ���ű�;

import java.util.Scanner;

public class �׳˼��� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		//���ٳ�����洢������
		int[] A = new int[100];
		int temp =0;
		//��֤��������Ϊһ
		A[99] = 1;
		//��ѭ����ÿ�ε���
		for(int i = 1;i <= n;i++) {
			for(int j = 99;j >= 0;j--) {
				A[j] = A[j]*i + temp;
				temp = 0;
				//���ڽ�λ�����ж�
				if(A[j] >= 10) {
					temp = A[j]/10;
					A[j] = A[j]%10;
				}
			}
		}
		//�ҵ������ݵĵ�һ������λ��
		for(int j = 0;j <= 99;j++) {
			if(A[j] != 0) {
				temp = j;
				break;
			}
		}
		for(int j = temp;j <= 99;j++) {
			System.out.print(A[j]);
		}
	}
}
