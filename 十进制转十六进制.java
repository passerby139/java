package 蓝桥杯;

import java.util.Scanner;

//十进制转十六进制
public class 十进制转十六进制 {
	public static void tentosixteen(int number) {
		int remainder=number%16;     //余数
		int quotient=number/16;          //商
		StringBuilder sixteen=new StringBuilder();
		while(quotient!=0){          //主要就是完成除k取余的工作
			getParament(remainder,sixteen);
			remainder=quotient%16;
			quotient=quotient/16;
		}
		getParament(remainder,sixteen);    //注意！当quotient为0时;我们还要将上一次的remainder放入到sixteen字符串中。
		int len=sixteen.length();
		for(int i=0;i<len;i++) {                       //逆序输出字符串
			System.out.print(sixteen.charAt(len-i-1));
		}
		
	}
	public static void getParament(int remainder,StringBuilder sixteen) {
		switch (remainder) {     //这个在二个地方需要用到，所以我把他封装成了函数
			case 10:sixteen.append('A');break;
			case 11:sixteen.append('B');break;
			case 12:sixteen.append('C');break;
			case 13:sixteen.append('D');break;
			case 14:sixteen.append('E');break;
			case 15:sixteen.append('F');break;
			default:sixteen.append(remainder);break;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int ten=scanner.nextInt();
		tentosixteen(ten);
	}
}
