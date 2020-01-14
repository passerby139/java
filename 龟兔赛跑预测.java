package 蓝桥杯;

import java.util.Scanner;

public class 龟兔赛跑预测 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int v1 = scanf.nextInt();  //兔子的速度
		int v2 = scanf.nextInt();  //乌龟的速度
		int t = scanf.nextInt();   //兔子领先距离设定
		int s = scanf.nextInt();   //兔子休息时间设定
		int l = scanf.nextInt();   //比赛总路程设定
		
		int Rl = 0;          //比赛结束兔子路程
		int Tl = 0;          //比赛结束乌龟路程
		int time = 0;        //比赛总用时
		boolean flag = false;
		
		while(true) {                  //z做死循环假设比赛不间断的进行
			time++;
			Rl += v1;
			Tl += v2;
			
			if(Rl >= l || Tl >= l)     //判断正常情况下退出条件
				break;
			
			if(Rl-Tl >= t) {           //处理兔子睡觉时发生的情况
				for(int i = 0 ;i < s;i++) {
					Tl += v2;
					time++;
					if(Tl >= l) {      //如果睡觉期间乌龟已到达终点的情况
						flag = true;
						break;
					}
				}
				if(flag)
					break;
			}
		}
		
		if(Rl < Tl)                     //根据结果输出相应的信息
			System.out.println("T");
		else if(Rl == Tl)
			System.out.println("D");
		else
			System.out.println("R");
		
		System.out.print(time);
	}
}
