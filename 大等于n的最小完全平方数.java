package ���ű�;

import java.util.Scanner;

public class �����n����С��ȫƽ���� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n = scanf.nextInt();
		int i = 0;
		for(;;i++) {
			if(i*i >= n)
				break;
		}

		System.out.println(i*i);
	}
}
