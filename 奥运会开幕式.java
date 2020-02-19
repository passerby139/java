package 蓝桥杯;

import java.util.Scanner;

public class 奥运会开幕式 {
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
	//创建学生链表
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
	
	
	//该方法用于显示链表
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

//学生定义结点
class StuNode{
	public int num;     //学生编号
	public StuNode next;  //指针结点
	public StuNode(int num) {
		super();
		this.num = num;
	}
	@Override
	public String toString() {
		return "StuNode [num=" + num + "]";
	}
	
	
}