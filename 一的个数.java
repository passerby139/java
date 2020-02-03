package 蓝桥杯;

import java.util.Scanner;

public class 一的个数 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int R = scanf.nextInt();
		
		int add = 0;
		for(int i = 1 ; i <= R ;i++) 
			add += math(i);
		System.out.println(add);
	}
	
	static int math(int i) {
		
		int temp = 0;
		int add = 0;
		while(i != 0) {
			temp = i%10;
			i = i/10;
			if(temp == 1)
				add++;
		}
		return add;
	}
}
