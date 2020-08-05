package À¶ÇÅ±­;

import java.util.Scanner;

public class three_add_one {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[100][2];
		int k = 0;
		while(true) {
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0 && m == 0)
				break;
			if(n > m) {
				int temp = n;
				 n = m;
				 m = temp;
			}
			arr[k][0] = n;
			arr[k++][1] = m;
		}
		for(int i = 0;i < k;i++) {
			Integer min = Integer.MIN_VALUE;
			for(int j = arr[i][0];j <= arr[i][1];j++) {
				int t = Max(j,0);
				if(t > min)
					min = t;
			}
			System.out.println(arr[i][0]+" "+arr[i][1]+" "+min);
		}
	}
	public static int Max(int i,int sum) {
		if (i == 1) {
			return sum+1;
		}
		if (i % 2 == 0) {
			return Max(i/2,sum+1);
		}
		else {
			return Max(i*3+1,sum+1);
		}
	}
}
