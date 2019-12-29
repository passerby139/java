package Lee_code;

import java.util.Scanner;

public class Íæ³ïÂë {
	public static void main(String[] args) {
		int[] chips = new int[5];
		int a=0;
		int b=0;
		Scanner scanf = new Scanner(System.in);
		
		for(int i = 0;i < 5;i++) {
			chips[i] = scanf.nextInt();
		}
		for(int i = 0;i < chips.length;i++) {
			if(chips[i] % 2 == 0)
				a++;
			else
				b++;
		}
		int x = a<b?a:b;
		System.out.println(x);
	}
}
