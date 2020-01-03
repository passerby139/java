package À¶ÇÅ±­;

import java.util.Scanner;

public class ×Ö·û´®¶Ô±È {
	public static void main(String[] arg){
		Scanner scanf = new Scanner(System.in);
		int i =0;
		String s1 = scanf.next();
		String s2 = scanf.next();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		if(s1.length() != s2.length())
			System.out.println(1);
		else {
			for(i = 0;i < s1.length();i++) {
				if(c1[i] != c2[i]) {
					if(c1[i] + 32 == c2[i] || c1[i] - 32 == c2[i])
						System.out.println(3);
					else
						System.out.println(4);
					break;
				}
			}
			if(i == s1.length())
				System.out.println(2);
		}
	}
}
