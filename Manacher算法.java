package 经典算法;

/**
 * 经典Manacher算法是解决寻找最大回文字串问题的最优解
 * 
 * 1.这个算法就是利用对称性来反复比较求解，在大范围中找小范围
 * 首先我们来解决回文串的判断，一般我们都会分情况讨论，因为长度的奇偶性绝对了算法的分支
 * 我们先假设一个长度为n的字符串，中间必定有n-1个连接，我们用‘#’代替，两者相加，我们就
 * 可以得到一个新的长度为2n-1的字符串，我们再给字符串的首位分别加上‘$’来防止越界问题(这
 * 里在java和c实现时，有所差异，c字符串末尾一定以‘/0’结束，但java并非如此，所以我们要在
 * 末尾添上‘/0’符号)
 * 
 * 2.处理好之后的字符串，他们的长度都为2n+1即奇数，所以可以统一处理，挨个变量，找出以单
 * 个元素为中心时，回文的最大半径是多少,按照规律，填写p数组，再寻找出p中最大值-1，就是
 * 所找到的最大回文字串
 * 
 */



import java.util.Scanner;

public class Manacher算法 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str  = in.next();
		char[] arr = new char[2*str.length()+3];
		int[] p = new int[2*str.length()+3];
		//处理字符串
		arr[0] = '$';
		arr[2*str.length()+1] = '\0';
		int j = 0;
		for(int i = 1;i < arr.length-1;i++) {
			arr[i++] = '#';
			if(i >= arr.length-1)
				break;
			arr[i] = str.charAt(j++);
		}
		manacher(arr,p);
	}
	public static void manacher(char[] str,int[] p) {
		int[][] max = {{0,0}};
		int size = str.length;
		p[0] = 1;
		int id = 0;
		int mx = 1;
		for(char i:str) {
			System.out.print(i+" ");
		}
		for(int i = 1;i < size-1;i++) {
			if(mx > i) {
				p[i] = Math.min(p[2*id-i], mx-i);
			}
			else {
				p[i] = 1;
			}
			for(;str[i+p[i]] == str[i-p[i]];p[i]++);
			if(mx < i+p[i]) {
				mx = i+p[i];
				id = i;
			}
			if(max[0][0] < p[i]){
				max[0][0] = p[i];
				max[0][1] = i;
			}
		}
		System.out.println();
		for(int i = max[0][1]-max[0][0]+2;i < max[0][1]+max[0][0];i=i+2) {
			System.out.print(str[i]);
		}
		System.out.println("是最大回文字串，长度为："+(max[0][0]-1));
	}

}
