package À¶ÇÅ±­;

import java.util.Scanner;

public class FJµÄ×Ö·û´® {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();
		
		int[] arr = new int[2000];
		
		arr[0] = 65;
		
		int j = 0;
		for(int i = 1;i < n;i++ ) {
			j = (int)Math.pow(2, i);
			int temp = j-1;
			arr[temp] = 65+i;
			for(int k = 0;k < temp;k++,j++) 
				arr[j] = arr[k];
		}
		
		for(int i = 0;i < j;i++)
			System.out.print((char)arr[i]);
	}
}
