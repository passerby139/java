package ѧ������Сϵͳ;

import java.util.Scanner;

public class StulistDemo {
	Scanner scanf = new Scanner(System.in);
	
	//ѧ����Ϣչʾ
	public void show(StuNode head) {
		StuNode temp = head;
		//�����п�
		if(temp.next == null) {
			System.out.println("(��û�д洢ѧ����Ϣ������Ϊ�գ������Թ���2�ɣ�����)");
			return;
		}
		//�������ÿһ�������Ϣ
		else {
			System.out.println("-----------miniѧ������ϵͳѧ����Ϣ��-----------");
			System.out.println("                    ѧ��     ����      �༶      �ܳɼ�                      ");
			System.out.println();
			while(temp.next != null) {
				temp = temp.next;
				System.out.println("            "+temp.id+"    "+temp.name+"    "+temp.classid+"     "+temp.score);
			}
		}
		System.out.println();
	}
	
	//���ѧ����Ϣ����
	public void add(StuNode head,StuNode pre) {
		//��ȡͷ���
		StuNode temp = head;
		//�����ҵ�β���
		while(true) {
			if(temp.next == null)
				break;
			temp = temp.next;
		}
		temp.next = pre;
		temp = pre;
		temp.next = null;
		
		System.out.println("(��ѧ����Ϣ��¼����ϣ���)                  �Ƿ����¼�룿  0��  1��");
		int flag = -1;
		flag = scanf.nextInt();
		//��ǿ����׳�ԣ��ų�����������ų�����У����ڷǷ����ֽ��������룩
		if(flag == 1) 
			add(head,create());

	}
	public StuNode create() {
		System.out.println("��������Ҫ��ӵ�ѧ����Ϣ");
		System.out.print("ѧ�ţ�");
		int id = scanf.nextInt();
		System.out.print("������");
		String name = scanf.next();
		System.out.print("�༶��");
		String classid = scanf.next();
		System.out.print("�ɼ���");
		double socer = scanf.nextInt();
		StuNode pre = new StuNode(id,name,classid,socer);
		return pre;
	}
	//ѧ���ɼ��޸ķ�������֤ѧ��Ϊ������
	public void modifi(StuNode head) {
		StuNode temp = head;
		//�п�����
		if(temp.next == null) {
			System.out.println("(��û�д洢ѧ����Ϣ������Ϊ�գ������Թ���2�ɣ�����)");
			return;
		}
		System.out.print("������Ҫ�޸�ѧ����ѧ�ţ�");
		int num = scanf.nextInt();
		boolean flag = false;
		//����Ѱ�Ҹ�ѧ����Ϣ
		while(temp.next != null) {
			temp = temp.next;
			if(temp.id == num) {
				flag = true;
				break;
			}
		}
		//���ҵ����޸Ĳ�����޸ĺ���
		if(flag) {
			System.out.print("�������޸ĺ�ķ�����");
			temp.score = scanf.nextInt();
			System.out.println("-----------miniѧ������ϵͳѧ����Ϣ��-----------");
			System.out.println("                    ѧ��     ����      �༶      �ܳɼ�                      ");
			System.out.println();
			System.out.println("            "+temp.id+"    "+temp.name+"    "+temp.classid+"     "+temp.score+"                               (�޸ĳɹ�����)");
			System.out.println();
		}
		else
			System.out.println("�ܱ�Ǹ����û�в��ҵ���ѧ����Ϣ��");
	}
	//ѧ����Ϣɾ������
	public void delete(StuNode head) {
		StuNode temp = head;
		//�п�����
		if(temp.next == null) {
			System.out.println("(��û�д洢ѧ����Ϣ������Ϊ�գ������Թ���2�ɣ�����)");
			return;
		}
		System.out.print("������Ҫɾ��ѧ����ѧ�ţ�");
		int num = scanf.nextInt();
		boolean flag = false;
		//��������
		while(temp.next != null) {
			if(temp.next.id == num) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		//���ҵ���ɾ�������Ϣ
		if(flag) {
			temp.next = temp.next.next;
			System.out.println("(��ѧ����Ϣ��ɾ��������)");
			System.out.println();
		}
		else
			System.out.println("�ܱ�Ǹ����û�в��ҵ���ѧ����Ϣ��");
	}
	//����ѧ����Ϣ���ҷ���
	public void find(StuNode head) {
		StuNode temp = head;
		//�п�����
		if(temp.next == null) {
			System.out.println("(��û�д洢ѧ����Ϣ������Ϊ�գ������Թ���2�ɣ�����)");
			return;
		}
		System.out.print("������Ҫ����ѧ����ѧ�ţ�");
		int num = scanf.nextInt();
		boolean flag = false;
		//��������
		while(temp != null) {
			temp = temp.next;
			if(temp.id == num) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("-----------miniѧ������ϵͳѧ����Ϣ��-----------");
			System.out.println("                    ѧ��     ����      �༶      �ܳɼ�                      ");
			System.out.println();
			System.out.println("            "+temp.id+"    "+temp.name+"    "+temp.classid+"      "+temp.score);
			System.out.println();
		}
		else
			System.out.println("�ܱ�Ǹ����û�в��ҵ���ѧ����Ϣ��");
	}
}
