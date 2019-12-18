package 蓝桥杯;

import java.util.Scanner;

/*
 * 解题思路：有两种方法，第一是我们去构造这样的特殊回文数，首先我们看这个数的特点，
 * 因为是五位和六五数的回文数，所以我们可以根据前三位确定这个五位或者六位的数字，
 * 那满足的要求就是每个位数加起来的值为n然后输出即可。第二种方法就是常用的方法了，
 * 遍历所有五位和六位的数，然后取出各个位数的值，判断相加是否是n+是否是回文数，个
 * 条件要同时满足。

原文链接：https://blog.csdn.net/kunzhoumei/article/details/86723837
 */
public class 特殊的回文数 {
	public static void speicalpalindrome(int n) {
		int x,y,z;
		//先输出五位数
		for(int i=1;i<10;i++) {
			x=i;
			for(int j=0;j<10;j++) {
				y=j;
				z=n-2*x-2*y;
				if(z>=0&&z<10) {
					System.out.print(x);
					System.out.print(y);
					System.out.print(z);
					System.out.print(y);
					System.out.print(x);
					System.out.println();

			}
		}
	}
	//输出六位数
	if(n%2==0) {
		for(int i=1;i<10;i++) {
			x=i;
			for(int j=0;j<10;j++) {
				y=j;
				z=n/2-x-y;
				if(z>=0&&z<10) {
					System.out.print(x);
					System.out.print(y);
					System.out.print(z);
					System.out.print(z);
					System.out.print(y);
					System.out.print(x);
					System.out.println();
				}
			}
		}
	}
	
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		speicalpalindrome(n);
		
	}
}
