package 蓝桥杯;

import java.util.Scanner;

public class 报时助手 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		
		String[] time = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", "eighteen", "nineteen", "twenty","thirty","forty","fifty"};
		//首先来处理时位的情况
		if(h <= 20)
			System.out.print(time[h]+" ");
		else {
			System.out.print(time[20]+ " "+time[h%20]+" ");
		}
		//再处理分位的情况
		if(m != 0) {
			//对不同时间段做不同处理
			switch(m/10) {
				case 2:{
					if(m == 20) 
						System.out.println(time[20]);
					else
						System.out.println(time[20]+" "+time[m%20]);
					break;
				}
				case 3:{
					if(m == 30) 
						System.out.println(time[21]);
					else
						System.out.println(time[21]+" "+time[m%30]);
					break;
				}
				case 4:{
					if(m == 40) 
						System.out.println(time[22]);
					else
						System.out.println(time[22]+" "+time[m%40]);
					break;
				}
				case 5:{
					if(m == 50) 
						System.out.println(time[23]);
					else
						System.out.println(time[23]+" "+time[m%50]);
					break;
				}
				default:{
					System.out.println(time[m]);break;
				}
			}
		}
		else
			System.out.println("o'clock");
	}
}
