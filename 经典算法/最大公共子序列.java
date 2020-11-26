package 经典算法;

import java.util.Scanner;
import java.util.Stack;

/*
 * 临界递归的动态规划问题，当字符串最后一个字符相等时，最大子字符串长度加一，否则
 * 就是比较A串n-1个字符和B串n个字符所组成的字符串长度所构成的最大公共子序列更长，
 * 所以整体利用dp棋盘记录递归结果，然后最后的值就是最大公共子序列。
 * 
 * 利用bp数组来回溯追踪分别是哪些
 * */
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
