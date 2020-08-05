package 蓝桥杯;

import java.util.Scanner;

public class 扫雷 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] num = new int[100][2];
		int k = 0;
		while(true) {
			System.out.print("请输入两个以空格分开的正整数作为棋盘大小：");
			int n = 0,m = 0;
			try {
				n = in.nextInt();
				m = in.nextInt();
			}
			catch(Exception e) {
				System.out.println("整数信息输入错误，请重新输入");
				in.nextLine();
				continue;
			}
			if(n == 0 && m == 0) {
				System.out.println("扫雷完毕！");
				break;
			}
			if(n < 2 || m <2) {
				System.out.println("最小默认棋盘为2x2!!,请重新输入!");
				continue;
			}
			char[][] flag = new char[n][m];
			char[][] res = new char[n][m];
			//初始化记录数组
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					res[i][j] = '0';
				}
			}
			System.out.println("请输入棋盘(中间不要添加任何分隔符,每行结束用enter换行):");
	 		//完成对地图的存储打印
			for(int i = 0;i < n;i++) {
				String str = in.next();
				if(str.length() != m) {
					System.out.println("棋盘信息输入错误!请重新输入此行");
					i--;
					continue;
				}
				for(int j = 0;j < m;j++) {
					flag[i][j] = str.charAt(j);
				}
			}
			//开始扫雷
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					if(flag[i][j] == '*') {
						res[i][j] = '*';
						find(i,j,n-1,m-1,res);
					}
				}
			}
			//打印记录数组
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
		//对四个顶点做特殊处理
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
		//对于四条临界边做特殊处理
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
		//对于一般情况做出处理
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