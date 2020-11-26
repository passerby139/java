package 经典算法;

import java.util.Scanner;

public class 字符串全排列 {
	static int[] flag = new int[10];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Permutation(str.toCharArray(),0,str.length()-1);
	}
	//判断是否重复值
	public static boolean IsSwap(char[] str,int from,int to) {
		boolean res = true;
		for(int i = from;i < to;i++) {
			if(str[to] == str[i]) {
				res = false;
				break;
			}
		}
		return res;
	}
	public static void Permutation(char[] str,int from,int to) {
		//如果字符串长度为一，直接输出，无需再排列
		if(from == to) {
			for(int i = 0;i < str.length;i++) {
				System.out.print(str[i]);
			}
			System.out.println();
			return;
		}
		else {
			//否则循环交互字符进行每一种排列
			for(int i = from;i <= to;i++) {
				if(!IsSwap(str,from,i))
					continue;
				char temp = str[i];
				str[i] = str[from];
				str[from] = temp;
				Permutation(str, from+1, to);
				//排列完成后要回归原串
				temp = str[from];
				str[from] = str[i];
				str[i] = temp;
				
			}
		}
	}
}
