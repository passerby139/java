package ���ű�;

import java.util.Scanner;

public class �صȽ�ѧ�� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int m = scanf.nextInt();
		int k = scanf.nextInt();
		
		//ѧ���ɼ�ͳ�Ʊ�
		int[][] stu = new int[n][m];
		//ѧ���ҿ�ͳ�Ʊ�
		int[] flag = new int[n];
		//ѧ������ͳ�Ʊ�
		int[] sort = new int[n];
		//��������ÿ��ѧ���ĸ��Ʒ������������С��85����ҿ�ͳ�Ʊ��¼Ϊ-1
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				stu[i][j] = scanf.nextInt();
				if(stu[i][j] < 85)
					flag[i] = -1;
			}
		}
		//��������
		for(int i = 0;i < n;i++) {
			int temp = 0;
			int Temp = 0;
			//�����ҳ�������߷֣�ͳ����ѧ��
			for(int j = 0;j < n;j++) {
				if(flag[j] != -1 && stu[j][0] > temp) {
					temp = stu[j][0];
					Temp = j;
				}
				//�����ֵ��Ʒ�����������˱Ƚ���һ��Ŀ�ɼ����������������Ƚ���һ��
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
			//��δ�ҿ�ͬѧ�������֮���˳�����ѭ��
			if(temp == 0 && Temp == 0)
				break;
			//��������ͳ�Ʊ����μ�¼�ɼ�����ѧ��ѧ�ţ������Ѿ��Ź�����ѧ������¼
			stu[Temp][0] = -1;
			sort[i] = Temp+1;
		}
		//��������ͳ�Ʊ��˳�򼰽�ѧ����������񽱵�ѧ����Ϣ��
		for(int i = 0;i < n;i++) {
			if(sort[i] == 0 || i == k)
				break;
			System.out.print(sort[i]+" ");
		}
			
	}
}
