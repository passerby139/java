package ѧ������Сϵͳ;

import java.util.Scanner;

public class Index {
	Scanner scanf = new Scanner(System.in);
	//����ͷ���
	StuNode head = new StuNode(0,"","",0);
	//��ȡͷ���ķ���
	public StuNode getHead() {
		return head;
	}
	//��ҳ����ʾ����
	public void show_index() {
		System.out.println("---------------��ӭʹ��miniѧ������ϵͳ---------------");
		System.out.println("|                  1.�鿴ѧ������Ϣ                               |");
		System.out.println("|                  2.���ѧ����Ϣ                                   |");
		System.out.println("|                  3.�޸�ѧ���ɼ���Ϣ                            |");
		System.out.println("|                  4.ɾ��ѧ����Ϣ                                   |");
		System.out.println("|                  5.����ѧ����Ϣ                                   |");
		System.out.println("-----------------------------------------------------");
		System.out.print("����������Ҫ�Ĺ��ܺţ�");
		//����ѡ�񷽷�
		choice(scanf.nextInt());
	}
	public void choice(int n) {
		//����StulistDemo����������ع��ܽ���
		StulistDemo stu = new StulistDemo();
		//��ǿ����׳�ԣ��ų�����������ų�����У����ڷǷ����ֽ��������룩
		while(true) {
			if(n >= 1 && n <= 5)
				break;
			else {
				System.out.println("��������ĺ�����Ч�����������룡����");
				System.out.print("��������������Ҫ�Ĺ��ܺţ�");
				n = scanf.nextInt();
			}
		}
		//�������ѡ����Ӧ�Ĺ��ܣ�Ȼ���������巽��
		while(true){
			switch(n){
				case 1:stu.show(getHead());break;
				case 2:stu.add(getHead(),stu.create());break;
				case 3:stu.modifi(getHead());break;
				case 4:stu.delete(getHead());break;
				case 5:stu.find(getHead());break;
			}
			//������ѭ������ɹ��ܺ��ٴη�����ҳ��
			show_index();
		}
	}
}
