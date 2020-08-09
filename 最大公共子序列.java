package 经典算法;

import java.util.Scanner;
import java.util.Stack;

public class 最大公共子序列 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack stack = new Stack();
		String str1 = in.next();
		String str2 = in.next();
		int m = str1.length();
		int n = str2.length();
		int[][] dp = new int[m+1][n+1];
		int[][] bp = new int[m+1][n+1];
		
		for(int i = 1;i <= m;i++) {
			for(int j = 1;j <= n;j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
					bp[i][j] = 1;
				}
				else if(dp[i-1][j] < dp[i][j-1]) {
					dp[i][j] = dp[i][j-1];
					bp[i][j] = 2;
				}
				else {
					dp[i][j] = dp[i-1][j];
					bp[i][j] = 3;
				}
			}
		}
		/*
		//System.out
		for(int i = 0;i <= m;i++) {
			for(int j = 0;j <= n;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//System.out
		for(int i = 0;i <= m;i++) {
			for(int j = 0;j <= n;j++) {
				System.out.print(bp[i][j]+" ");
			}
			System.out.println();
		}*/
		while(true) {
			if(m == 0 || n == 0)
				break;
			if(bp[m][n] == 1) {
				stack.push(str1.charAt(m-1));
				m--;
				n--;
			}
			else if(bp[m][n] == 2)
				n--;
			else
				m--;
		}
		System.out.println("最大公共子序列长度为:"+stack.size());
		int temp = stack.size();
		for(int i = 0;i < temp;i++)
			System.out.print(stack.pop()+" ");
		
	}
}
