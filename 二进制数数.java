package 蓝桥杯;

import java.util.Scanner;

public class 二进制数数 {
	public static void main (String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int L = scanf.nextInt();
		int R = scanf.nextInt();
		
		int add = 0;
		for(int i = L ; i <= R ;i++) 
			add += math(i);
		System.out.println(add);
	}
	
	static int math(int i) {
		
		int temp = 0;
		int add = 0;
		while(i != 0) {
			temp = i%2;
			i = i/2;
			if(temp == 1)
				add++;
		}
		return add;
	}
}
