package 学生管理小系统;

import java.util.Scanner;

public class StulistDemo {
	Scanner scanf = new Scanner(System.in);
	
	//学生信息展示
	public void show(StuNode head) {
		StuNode temp = head;
		//链表判空
		if(temp.next == null) {
			System.out.println("(还没有存储学生信息，链表为空，先试试功能2吧！！！)");
			return;
		}
		//遍历输出每一个结点信息
		else {
			System.out.println("-----------mini学生管理系统学生信息表-----------");
			System.out.println("                    学号     姓名      班级      总成绩                      ");
			System.out.println();
			while(temp.next != null) {
				temp = temp.next;
				System.out.println("            "+temp.id+"    "+temp.name+"    "+temp.classid+"     "+temp.score);
			}
		}
		System.out.println();
	}
	
	//添加学生信息方法
	public void add(StuNode head,StuNode pre) {
		//获取头结点
		StuNode temp = head;
		//遍历找到尾结点
		while(true) {
			if(temp.next == null)
				break;
			temp = temp.next;
		}
		temp.next = pre;
		temp = pre;
		temp.next = null;
		
		System.out.println("(该学生信息已录入完毕！！)                  是否继续录入？  0否  1是");
		int flag = -1;
		flag = scanf.nextInt();
		//增强程序健壮性，排出其他乱码干扰程序进行（对于非法数字进行再输入）
		if(flag == 1) 
			add(head,create());

	}
	public StuNode create() {
		System.out.println("请输入所要添加的学生信息");
		System.out.print("学号：");
		int id = scanf.nextInt();
		System.out.print("姓名：");
		String name = scanf.next();
		System.out.print("班级：");
		String classid = scanf.next();
		System.out.print("成绩：");
		double socer = scanf.nextInt();
		StuNode pre = new StuNode(id,name,classid,socer);
		return pre;
	}
	//学生成绩修改方法（保证学号为主键）
	public void modifi(StuNode head) {
		StuNode temp = head;
		//判空条件
		if(temp.next == null) {
			System.out.println("(还没有存储学生信息，链表为空，先试试功能2吧！！！)");
			return;
		}
		System.out.print("请输入要修改学生的学号：");
		int num = scanf.nextInt();
		boolean flag = false;
		//遍历寻找该学生信息
		while(temp.next != null) {
			temp = temp.next;
			if(temp.id == num) {
				flag = true;
				break;
			}
		}
		//若找到则修改并输出修改后结果
		if(flag) {
			System.out.print("请输入修改后的分数：");
			temp.score = scanf.nextInt();
			System.out.println("-----------mini学生管理系统学生信息表-----------");
			System.out.println("                    学号     姓名      班级      总成绩                      ");
			System.out.println();
			System.out.println("            "+temp.id+"    "+temp.name+"    "+temp.classid+"     "+temp.score+"                               (修改成功！！)");
			System.out.println();
		}
		else
			System.out.println("很抱歉！！没有查找到该学生信息。");
	}
	//学生信息删除方法
	public void delete(StuNode head) {
		StuNode temp = head;
		//判空条件
		if(temp.next == null) {
			System.out.println("(还没有存储学生信息，链表为空，先试试功能2吧！！！)");
			return;
		}
		System.out.print("请输入要删除学生的学号：");
		int num = scanf.nextInt();
		boolean flag = false;
		//遍历查找
		while(temp.next != null) {
			if(temp.next.id == num) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		//若找到则删除相关信息
		if(flag) {
			temp.next = temp.next.next;
			System.out.println("(该学生信息已删除！！！)");
			System.out.println();
		}
		else
			System.out.println("很抱歉！！没有查找到该学生信息。");
	}
	//单个学生信息查找方法
	public void find(StuNode head) {
		StuNode temp = head;
		//判空条件
		if(temp.next == null) {
			System.out.println("(还没有存储学生信息，链表为空，先试试功能2吧！！！)");
			return;
		}
		System.out.print("请输入要查找学生的学号：");
		int num = scanf.nextInt();
		boolean flag = false;
		//遍历查找
		while(temp != null) {
			temp = temp.next;
			if(temp.id == num) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("-----------mini学生管理系统学生信息表-----------");
			System.out.println("                    学号     姓名      班级      总成绩                      ");
			System.out.println();
			System.out.println("            "+temp.id+"    "+temp.name+"    "+temp.classid+"      "+temp.score);
			System.out.println();
		}
		else
			System.out.println("很抱歉！！没有查找到该学生信息。");
	}
}
