package ¿∂«≈±≠;

import java.util.Scanner; 

public class ¬Ï“œ∏–√∞ {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int num = 1;
		int temp = 0;
		int ants[] = new int[200];
		
		for(int i = 0;i < n;i++)
			ants[i] = scanf.nextInt();
		if(ants[0] > 0) {
			for(int i = 1;i < n;i++) {
				if(ants[i] < 0 && -ants[i] > ants[0])
					temp++;
			}
			num += temp;
			if(temp == 0)
				System.out.print(1);
			else {
				temp = 0;
				for(int i = 1;i < n;i++) {
					if(ants[i] > 0 && ants[i] < ants[0])
						temp++;
				}
				num += temp;
			}
		}
		else {
			temp = 0;
			for(int i = 1;i < n;i++) {
				if(ants[i] > 0 && ants[i] < -ants[0])
					temp++;
			}
			num += temp;
			if(temp == 0)
				System.out.print(1);
			else {
				temp = 0;
				for(int i = 1;i < n;i++) {
					if(ants[i] < 0 && ants[i] < ants[0])
						temp++;
				}
				num += temp;
			}
			System.out.print(num);
		}
	}
}
