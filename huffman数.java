package À¶ÇÅ±­;

import java.util.Scanner;

public class huffmanÊý {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();
		int[] num = new int[n];
		int i,j,a,b;
		int temp1 = 0,temp2 = 0;
		int add=0;
		
		for(i=0;i<n;i++)
			num[i] = scanf.nextInt();
		
		for(i = 0;i < n-1;i++) {
			a = 1001;
			b = 1001;
			for(j = 0;j < n;j++) {
				if(num[j] < a && num[j] != 0) {
					a = num[j];
					temp1 = j;
				}
			}
			num[temp1] = 0;
			for(j = 0;j < n;j++) {
				if(num[j] < b && num[j] != 0) {
					b = num[j];
					temp2 = j;
				}
			}
			num[temp2] = 0;
			num[temp1] = a+b;
			add = add + num[temp1];
			System.out.print(a);
			System.out.println(	b);
		}
		System.out.println(add);
	}
}
