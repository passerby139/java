package 蓝桥杯;

import java.util.Scanner;

public class 十六进制转十进制 {
	public static void main(String[] args) {
		//创建Scanner类进行键盘输入
				Scanner scanf = new Scanner(System.in);
					//使用键盘输入字符串
				String str = scanf.next();
				//将数转换
				System.out.println(H_Change_D(str));
	}
	
	//16转10
	public static long H_Change_D(String str) {
		//设置返回接受的变量
		long DEC = 0l;
		//设置单个字符的对应数字
		int one = 0;
		int j = str.length()-1;
		//字符串转为字符数组便于遍历
		char[] chararr = str.toCharArray();
		
		for(int i = 0;i < str.length();i++) {
			//判断为数字字符时的情况
			if('0' <= chararr[i] && chararr[i] <= '9')
				one = (int) (chararr[i] - '0');
			//判断为字母字符时的情况
			if('A' <= chararr[i] && chararr[i] <= 'F') 
				one = (int) (chararr[i] - 'A' + 10);
			//进行累加求和得出十六进制转成十进制的数
			DEC = (long) (DEC + one*Math.pow(16, j));
			j--;
		}
		return DEC;
	}	
	
	
}
