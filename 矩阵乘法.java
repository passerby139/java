package 蓝桥杯;

import java.util.Scanner;

public class 矩阵乘法 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//设置矩阵阶数
		int n = scanf.nextInt();
		//设置矩阵相乘幂数
		int m = scanf.nextInt();
		
		int[][] arr = new int[n][n];
		//输入矩阵
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) 
				arr[i][j] = scanf.nextInt();
		}
		//调用相关方法计算
		mi(arr,arr,n,m-1);
	}
		//矩阵乘法运算方法
		static void mi(int[][] arr,int[][] arr1,int n,int m) {         //四个参数分别为当前阶数矩阵；原始阶数矩阵；矩阵阶数；需要运算的次数
			m--;
			//定义运算结果
			int[][] crr = new int[n][n];
			//定义累加器
			int add =0;
			//矩阵乘法运算
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < n;j++) {
					add = 0;
					for(int k = 0;k < n;k++) {
						add += arr[i][k]*arr1[k][j];
					}
					crr[i][j] = add;
				}
			}
			//做出判断，如果达到要运算的幂次，则输出结果
			if(m == 0) {
				for(int i = 0;i < n;i++) {
					for(int j = 0;j < n;j++)
						System.out.print(crr[i][j]+" ");
					System.out.println();
				}
			}
			//若当初设置的时0次幂运算时，输出所对应的结果
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
			//若还未达到运算次数，递归运算
			else {
				mi(crr,arr1,n,m);
			}
		}
}
