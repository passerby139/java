package ���ű�;

import java.util.Scanner;

public class ����˷� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//���þ������
		int n = scanf.nextInt();
		//���þ����������
		int m = scanf.nextInt();
		
		int[][] arr = new int[n][n];
		//�������
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) 
				arr[i][j] = scanf.nextInt();
		}
		//������ط�������
		mi(arr,arr,n,m-1);
	}
		//����˷����㷽��
		static void mi(int[][] arr,int[][] arr1,int n,int m) {         //�ĸ������ֱ�Ϊ��ǰ��������ԭʼ�������󣻾����������Ҫ����Ĵ���
			m--;
			//����������
			int[][] crr = new int[n][n];
			//�����ۼ���
			int add =0;
			//����˷�����
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < n;j++) {
					add = 0;
					for(int k = 0;k < n;k++) {
						add += arr[i][k]*arr1[k][j];
					}
					crr[i][j] = add;
				}
			}
			//�����жϣ�����ﵽҪ������ݴΣ���������
			if(m == 0) {
				for(int i = 0;i < n;i++) {
					for(int j = 0;j < n;j++)
						System.out.print(crr[i][j]+" ");
					System.out.println();
				}
			}
			//���������õ�ʱ0��������ʱ���������Ӧ�Ľ��
			else if(m == -2) {
				for(int i = 0;i < n;i++) {
					for(int j = 0;j < n;j++) {
						if(j == i) {
							System.out.print(1+" ");
							continue;
						}
						System.out.print(0+" ");
					}
					System.out.println();
				}
			}
			//����δ�ﵽ����������ݹ�����
			else {
				mi(crr,arr1,n,m);
			}
		}
}
