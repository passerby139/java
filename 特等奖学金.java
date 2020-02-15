package 蓝桥杯;

import java.util.Scanner;

public class 特等奖学金 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int m = scanf.nextInt();
		int k = scanf.nextInt();
		
		//学生成绩统计表
		int[][] stu = new int[n][m];
		//学生挂科统计表
		int[] flag = new int[n];
		//学生排名统计表
		int[] sort = new int[n];
		//依次输入每个学生的各科分数，如果单科小于85分则挂科统计表记录为-1
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				stu[i][j] = scanf.nextInt();
				if(stu[i][j] < 85)
					flag[i] = -1;
			}
		}
		//进行排名
		for(int i = 0;i < n;i++) {
			int temp = 0;
			int Temp = 0;
			//依次找出单科最高分，统计其学号
			for(int j = 0;j < n;j++) {
				if(flag[j] != -1 && stu[j][0] > temp) {
					temp = stu[j][0];
					Temp = j;
				}
				//若出现单科分数相等则两人比较下一科目成绩，若仍相等则继续比较下一科
				if(flag[j] != -1 && stu[j][0] == temp) {
					for(int a = 1;a < m;a++) {
						if(stu[j][a] > stu[Temp][a])
							Temp = j;
						else if(stu[j][a] < stu[Temp][a])
							break;
						else
							continue;
					}
				}
			}
			//当未挂科同学排名完成之后，退出排名循环
			if(temp == 0 && Temp == 0)
				break;
			//否则排名统计表依次记录成绩最优学生学号，并对已经排过名的学生做记录
			stu[Temp][0] = -1;
			sort[i] = Temp+1;
		}
		//按照排名统计表的顺序及奖学金名额，公布获奖的学生信息。
		for(int i = 0;i < n;i++) {
			if(sort[i] == 0 || i == k)
				break;
			System.out.print(sort[i]+" ");
		}
			
	}
}
