package 蓝桥杯;

import java.util.Scanner;

public class 大等于n的最小完全平方数 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();
		int i = 0;
		for(;;i++) {
			if(i*i >= n)
				break;
		}

		System.out.println(i*i);
	}
}
