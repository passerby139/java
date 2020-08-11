package 经典算法;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * KMP是有A,B两个字符串，求得B字符串在A字符串当中第一次出现的位置的最优解算法
 *
 * 1.首先不考虑效率问题，我们能想到的暴力算法就是利用双指针i,j来分别指向两个字符串，当某位元素
 * 相等时，我们同时移动i,j指针，若不同则继续移动i号指针然后将j归位为0并重新比较。
 * 
 * 2.我们经思考，觉得若每次归位为0，再重新比较，无疑是做了很大的重复工作，而降低了算法的整体效率，
 * 能不能当元素不相等时，我们让j跳到某一特定位置，进而减少大量的重复工作，这个时候我们就可以利用KMP
 * 算法，它完美的利用了字符串的最大前缀和最大后缀相等的情况，使用next数组进行记录，每次j该跳转的位置。
 * 
 * 3.next[i]是指B字符串在i位元素以前的相等的前缀和后缀的最大长度，若A,B字符串第i位时，发现不等，则直
 * 接跳至第next[i]位，就可继续，若仍不相同则继续重复递归。
 */
public class KMP算法 {
	//求解模式串当中的next记录数组
	public static int[] next(int[] next,String str) {
		//当i为首元素时，无最大公共前缀和公共后缀，所以赋值-1
		next[0] = -1;
		//k为一个记录长度的变量
		int k  = -1;
		//j用来记录某一元素，以便遍历
		int j = 0;
		while(j < str.length()-1) {
			//若k等于-1表明为首元素，长度和下标可同时加1
			//若当前j-1号字符和最大公共前缀的下一位相等，最大公共前后缀长度可直接加1
			//例: a b c d e a b c d f a d
			//假设当前j-1为 7 ，即字符“d”；
			//j-1的最大公共前后缀长度为2，我们就比较strb.charAt(2)和strb.charAt(7)
			//因为同为字符“c”，所以j号元素的最大公共字串长度为k+1等于3
			//即next[8] = 3
			if(k == -1 || str.charAt(j) == str.charAt(k)) {
				++k;
				++j;
				next[j] = k;
			}
			//如若上述推到不相等，则k变回至最大公共前缀的值，递归再判断
			else {
				k = next[k];
			}
		}
		return next;
	}
	public static int KMP(String stra,String strb,int[] next) {
		//还是利用双指针记录
		int i = 0,j = 0;
		while(i < stra.length()) {
			//若跳至-1说明无最大公共前缀和后缀直接相当于暴力求解的j回归于0
			//若相等则i和j同时+1
			if(j == -1 || stra.charAt(i) == strb.charAt(j)) {
				++i;
				++j;
			}
			//这里才是KMP算法的核心，通过记录数组next使得j指针不会直接跳向首字符重新比较
			else {
				j = next[j];
			}
			//当j等于模式串长度时说明比较完成，可以返回答案
			if(j == strb.length()) {
				int ans = i - strb.length();
				return ans+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String stra = in.next();
		String strb = in.next();
		int[] temp = new int[strb.length()];
		int[] next = next(temp,strb);
		for(int i = 0;i < next.length;i++) {
			System.out.print(strb.charAt(i)+"-"+next[i]+"   ");
		}
		System.out.println(KMP(stra,strb,next));
	}
}
