package À¶ÇÅ±­;

import java.util.Scanner;

public class Ê±¼ä×ª»» {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		
		int H = n / 3600;
		n = n % 3600;
		int M = n / 60;
		n = n % 60;
		int S = n;
		
		System.out.print(H+":"+M+":"+S);
	}
}
