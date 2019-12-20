package 蓝桥杯;

import java.util.Scanner;

public class 阶乘计算 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		//开辟长数组存储大数据
		int[] A = new int[100];
		int temp =0;
		//保证迭代处置为一
		A[99] = 1;
		//做循环，每次迭代
		for(int i = 1;i <= n;i++) {
			for(int j = 99;j >= 0;j--) {
				A[j] = A[j]*i + temp;
				temp = 0;
				//对于进位做的判断
				if(A[j] >= 10) {
					temp = A[j]/10;
					A[j] = A[j]%10;
				}
			}
		}
		//找到大数据的第一个数字位置
		for(int j = 0;j <= 99;j++) {
			if(A[j] != 0) {
				temp = j;
				break;
			}
		}
		for(int j = temp;j <= 99;j++) {
			System.out.print(A[j]);
		}
	}
}
