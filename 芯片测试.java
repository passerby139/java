package À¶ÇÅ±­;

import java.util.Scanner;

public class Ð¾Æ¬²âÊÔ {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				arr[i][j] = scanf.nextInt();
			}
		}
		
		int temp = 0;
		for(int j = 0;j < n;j++) {
			int True = 0;
			int False = 0;
			for(int i = 0;i < n;i++) {
				if(i == j)
					continue;
				else if(arr[i][j] == 0)
					False++;
				else
					True++;
			}
			if(True >= False) {
				temp = j;            //´ËÐ¾Æ¬ÎªºÃµÄ
				break;
			}
				
		}
		
		for(int i = 0;i < n;i++) {
			if(arr[temp][i] == 1)
				System.out.print(i+1+" ");
		}
			
	}
}
