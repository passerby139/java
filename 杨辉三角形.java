package 蓝桥杯;

import java.util.Scanner;

public class 杨辉三角形 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//用户输入需要打印杨慧三角形的行数
		int n = scanf.nextInt();
		//存放数的二维数组
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
