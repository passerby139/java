package 蓝桥杯;

import java.util.Scanner;

public class 审美课 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();             //学生数
		int m = scanf.nextInt();             //绘画数
		
		int[][] arr = new int[n][m];         //学生对于绘画意见统计
		int[][] brr = new int[n][n];         //学生意见完全相反统计
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				arr[i][j] = scanf.nextInt();
			}
		}
		   
		for(int i = 0 ; i < n ;i++) {             //依次判断同学们对于某一幅画的意见
			for(int j = 0; j < m;j++) {
				for(int k = i;k < n;k++) {
					if(arr[i][j] == arr[k][j])     //若有其一相同意见则不足以完全反对，统计数组相关位置-1
						brr[i][k] = -1;
				}
			}
		}
		
		int add =0;
		for(int i = 0;i < n;i++) {               //所有作品统计完成之后对于意见统计表进行总数统计
			for(int j = i;j < n;j++) {
				if(brr[i][j] == 0)
					add++;
			}
		}

		System.out.println(add);
	}
}
