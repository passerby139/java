package 蓝桥杯;

import java.util.Scanner;

public class 分解质因数 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//设置因数分解的上下界限
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		
		//依次便利循环找到素数
		for(;a <= b;a++) {
			//若为素数直接输出
			if(find(a) == 1) {
				System.out.println(a + "=" + a);
			}
			//否则调用因式分解方法函数
			else {
				chai(a);
			}
		}
	}
	//素数寻找方法
	static int find(int x) {
		int y = x;
		for(x=x-1;x>1;x--) {
			if(y % x == 0)
				break;
		}
		if(x == 1)
			return 1;
		else
			return 0;
	}
	//因式分解方法
	static void chai(int x) {
		int[] num = new int[100];
		int i = 0;
		int k = 2;
		int y=x;
		while(x != 0 && x != 1) {
			if(x % k != 0) {
				k++;
				continue;
			}
			else {
				num[i] = k;
				i++;
				x=x/k;
			}
		}
		System.out.print(y+"=");
		for(int j = 0;j <= i;j++) {
			if(j == i-1) {
				System.out.print(num[j]);
				break;
			}
			System.out.print(num[j]+"*");
		}
		if(x != 0 && x != 1)
			System.out.print("*"+x+"\n");
		else
			System.out.print("\n");
	}
}
