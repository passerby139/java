package ���ű�;

import java.util.Scanner;

public class ɨ�� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] num = new int[100][2];
		int k = 0;
		while(true) {
			System.out.print("�����������Կո�ֿ�����������Ϊ���̴�С��");
			int n = 0,m = 0;
			try {
				n = in.nextInt();
				m = in.nextInt();
			}
			catch(Exception e) {
				System.out.println("������Ϣ�����������������");
				in.nextLine();
				continue;
			}
			if(n == 0 && m == 0) {
				System.out.println("ɨ����ϣ�");
				break;
			}
			if(n < 2 || m <2) {
				System.out.println("��СĬ������Ϊ2x2!!,����������!");
				continue;
			}
			char[][] flag = new char[n][m];
			char[][] res = new char[n][m];
			//��ʼ����¼����
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					res[i][j] = '0';
				}
			}
			System.out.println("����������(�м䲻Ҫ����κηָ���,ÿ�н�����enter����):");
	 		//��ɶԵ�ͼ�Ĵ洢��ӡ
			for(int i = 0;i < n;i++) {
				String str = in.next();
				if(str.length() != m) {
					System.out.println("������Ϣ�������!�������������");
					i--;
					continue;
				}
				for(int j = 0;j < m;j++) {
					flag[i][j] = str.charAt(j);
				}
			}
			//��ʼɨ��
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					if(flag[i][j] == '*') {
						res[i][j] = '*';
						find(i,j,n-1,m-1,res);
					}
				}
			}
			//��ӡ��¼����
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------------------------------");
		}
	}
	public static void find(int i,int j,int n,int m,char[][] res) {
		//���ĸ����������⴦��
		if(i == 0 && j == 0) {
			add(i,j+1,res);
			add(i+1,j+1,res);
			add(i+1,j,res);
		}
		else if(i == 0 && j == m) {
			add(i,j-1,res);
			add(i+1,j-1,res);
			add(i+1,j,res);
		}
		else if(i == n && j == 0) {
			add(i-1,j,res);
			add(i-1,j+1,res);
			add(i,j+1,res);
		}
		else if(i == n && j == m) {
			add(i,j-1,res);
			add(i-1,j-1,res);
			add(i-1,j,res);
		}
		//���������ٽ�������⴦��
		else if(i == 0) {
			add(i,j-1,res);
			add(i+1,j-1,res);
			add(i+1,j,res);
			add(i+1,j+1,res);
			add(i,j+1,res);
		}
		else if(j == 0) {
			add(i-1,j,res);
			add(i-1,j+1,res);
			add(i,j+1,res);
			add(i+1,j+1,res);
			add(i+1,j,res);
		}
		else if(i == n) {
			add(i,j-1,res);
			add(i-1,j-1,res);
			add(i-1,j,res);
			add(i-1,j+1,res);
			add(i,j+1,res);
		}
		else if(j == m) {
			add(i-1,j,res);
			add(i-1,j-1,res);
			add(i,j-1,res);
			add(i+1,j-1,res);
			add(i+1,j,res);
		}
		//����һ�������������
		else {
			add(i-1,j-1,res);
			add(i-1,j,res);
			add(i-1,j+1,res);
			add(i,j+1,res);
			add(i+1,j+1,res);
			add(i+1,j,res);
			add(i+1,j-1,res);
			add(i,j-1,res);
		}
	}
	public static void add(int i,int j,char[][] res) {
		if(res[i][j] != '*')
			res[i][j] = (char)(res[i][j]+1);
		else
			return;
	}
}
/*
			 3 5
			**...
			.....
			.*...
 */