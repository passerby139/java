package ���ű�;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();             //ѧ����
		int m = scanf.nextInt();             //�滭��
		
		int[][] arr = new int[n][m];         //ѧ�����ڻ滭���ͳ��
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				arr[i][j] = scanf.nextInt();
			}
		}
		
		int add = 0;
		int k = 0;
		
		for(int i = 0 ; i < n ;i++) {             //�����ж�ͬѧ�Ƕ���ĳһ���������
			for(int j = i; j < n;j++) {
				for(k = 0;k < m;k++) {
					if(arr[i][k] == arr[j][k])
						break;
				}
				if(k == m)
					add++;
			}
		}
		System.out.println(add);
	}
}
