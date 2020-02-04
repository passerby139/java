package 蓝桥杯;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();             //学生数
		int m = scanf.nextInt();             //绘画数
		
		int[][] arr = new int[n][m];         //学生对于绘画意见统计
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				arr[i][j] = scanf.nextInt();
			}
		}
		
		int add = 0;
		int k = 0;
		
		for(int i = 0 ; i < n ;i++) {             //依次判断同学们对于某一幅画的意见
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
