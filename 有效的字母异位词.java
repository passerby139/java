package Lee_code;

import java.util.Scanner;

public class ��Ч����ĸ��λ�� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int i;
		int j;
		
		String s = scanf.next();
		String p = scanf.next();
		
		char[] c = s.toCharArray();
		char[] x = p.toCharArray();
		
		for(i = 0;i < x.length;i++) {
			for(j = 0;j < c.length;j++) {
				if(x[i] == c[j]) {
					c[j] = 0;
					break;
				}
			}
			if(j == c.length)
				break;
		}
		
		if(i < x.length) 
			System.out.println("����");
		else
			System.out.println("��");
		
	}

}
