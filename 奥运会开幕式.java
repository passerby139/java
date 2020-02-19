package ���ű�;

import java.util.Scanner;

public class ���˻ῪĻʽ {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int m = scanf.nextInt();
		
		MinkedlistDemo Link = new MinkedlistDemo();
		Link.create(Link.getHead(),n);
		if(Link.choose(Link.getHead(),m) == 0)
			System.out.println(n);
		else
			System.out.println(Link.choose(Link.getHead(),m));
	}
}

class MinkedlistDemo{
	StuNode head = new StuNode(0);
	
	public  StuNode getHead() {
		return head;
	}
	//����ѧ������
	public void create (StuNode head,int n) {
		StuNode temp = head;
		for(int i = 1;i <= n;i++) {
			StuNode pre = new StuNode(i);
			temp.next = pre;
			temp = pre;
		}
		temp.next = head.next;
	}
	
	public int choose(StuNode head,int m) {
		StuNode temp = head.next;
		int i = 1;
		if(m == 1)
			return 0;
		else {
			while(temp.next != temp) {
				if(i+1 == m){
					temp.next = temp.next.next;
					i = 1;
					temp = temp.next;
				}
				else{
					i++;
					temp = temp.next;
				}
			}
			return temp.num;
		}
	}
	
	
	//�÷���������ʾ����
	public void show(StuNode head) {
		StuNode temp = head.next;
		while(true) {
			System.out.println(temp);
			if(temp.next == null)
				break;
			temp = temp.next;
		}
	}
	
}

//ѧ��������
class StuNode{
	public int num;     //ѧ�����
	public StuNode next;  //ָ����
	public StuNode(int num) {
		super();
		this.num = num;
	}
	@Override
	public String toString() {
		return "StuNode [num=" + num + "]";
	}
	
	
}