package 经典算法;

import java.util.Scanner;

public class Kmp算法再联系 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		int[] next = createNext(str2);
		/*for (int i = 0; i < next.length; i++) {
			System.out.print(next[i]+" ");
		}*/
		find(str1,str2,next);
	}
	public static int[] createNext(String str) {
		int[] next = new int[str.length()];
		
		int k = -1;
		next[0] = -1;
		
		for (int i = 1; i < next.length; i++) {
			if(str.charAt(i) == str.charAt(k+1)) {
				k++;
				next[i] = k;
			}else {
				k = -1;
				next[i] = k;
			}
		}
		
		return next;
	}
	public static void find(String str1,String str2,int[] next) {
		int j = 0;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == str2.charAt(j)) {
				j++;
			}else {
				j = next[j]+1;
			}
			if(j >= str2.length()) {
				System.out.println(i - str2.length()+1);
				break;
			}
		}
		if(j < str2.length()-1) {
			System.out.println("b串并不是a串的子串");
		}
	}
}
