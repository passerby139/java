package ���ű�;

import java.util.Scanner;

public class ��������� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//�û�������Ҫ��ӡ��������ε�����
		int n = scanf.nextInt();
		//������Ķ�ά����
		int[][] arr = new int[50][50];
		
		for(int i = 1; i <= n;i++) {
			for(int j = 1;j <= i;j++) {
				if(j == 1 && j == i)
					arr[i][j] = 1;
				else {
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
