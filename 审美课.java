package ���ű�;

import java.util.Scanner;

public class ������ {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();             //ѧ����
		int m = scanf.nextInt();             //�滭��
		
		int[][] arr = new int[n][m];         //ѧ�����ڻ滭���ͳ��
		int[][] brr = new int[n][n];         //ѧ�������ȫ�෴ͳ��
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				arr[i][j] = scanf.nextInt();
			}
		}
		   
		for(int i = 0 ; i < n ;i++) {             //�����ж�ͬѧ�Ƕ���ĳһ���������
			for(int j = 0; j < m;j++) {
				for(int k = i;k < n;k++) {
					if(arr[i][j] == arr[k][j])     //������һ��ͬ�����������ȫ���ԣ�ͳ���������λ��-1
						brr[i][k] = -1;
				}
			}
		}
		
		int add =0;
		for(int i = 0;i < n;i++) {               //������Ʒͳ�����֮��������ͳ�Ʊ��������ͳ��
			for(int j = i;j < n;j++) {
				if(brr[i][j] == 0)
					add++;
			}
		}

		System.out.println(add);
	}
}
