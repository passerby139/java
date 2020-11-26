package 经典算法;

import java.util.*;

public class _01_背包问题 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Foods> foods = new ArrayList<Foods>();
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i = 0;i < n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			Foods temp = new Foods(i+1,a,b);
			foods.add(temp);
		}
		int[][] dp = new int[n+1][m+1];
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= m;j++) {
				if(j < foods.get(i-1).size)
					dp[i][j] = dp[i-1][j];
				else
					dp[i][j] = Math.max(dp[i-1][j], (dp[i-1][j-foods.get(i-1).size]+foods.get(i-1).val));
			}
		}
		for(int i = 0;i <= n;i++) {
			for(int j = 0;j <= m;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class Foods {
	int num;
	int val;
	int size;
	public Foods(int num,int size,int val) {
		this.num = num;
		this.val = val;
		this.size = size;
	}
}
