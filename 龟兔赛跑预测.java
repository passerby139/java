package ���ű�;

import java.util.Scanner;

public class ��������Ԥ�� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int v1 = scanf.nextInt();  //���ӵ��ٶ�
		int v2 = scanf.nextInt();  //�ڹ���ٶ�
		int t = scanf.nextInt();   //�������Ⱦ����趨
		int s = scanf.nextInt();   //������Ϣʱ���趨
		int l = scanf.nextInt();   //������·���趨
		
		int Rl = 0;          //������������·��
		int Tl = 0;          //���������ڹ�·��
		int time = 0;        //��������ʱ
		boolean flag = false;
		
		while(true) {                  //z����ѭ�������������ϵĽ���
			time++;
			Rl += v1;
			Tl += v2;
			
			if(Rl >= l || Tl >= l)     //�ж�����������˳�����
				break;
			
			if(Rl-Tl >= t) {           //��������˯��ʱ���������
				for(int i = 0 ;i < s;i++) {
					Tl += v2;
					time++;
					if(Tl >= l) {      //���˯���ڼ��ڹ��ѵ����յ�����
						flag = true;
						break;
					}
				}
				if(flag)
					break;
			}
		}
		
		if(Rl < Tl)                     //���ݽ�������Ӧ����Ϣ
			System.out.println("T");
		else if(Rl == Tl)
			System.out.println("D");
		else
			System.out.println("R");
		
		System.out.print(time);
	}
}
