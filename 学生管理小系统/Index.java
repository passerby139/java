package 学生管理小系统;

import java.util.Scanner;

public class Index {
	Scanner scanf = new Scanner(System.in);
	//创建头结点
	StuNode head = new StuNode(0,"","",0);
	//获取头结点的方法
	public StuNode getHead() {
		return head;
	}
	//主页面显示方法
	public void show_index() {
		System.out.println("---------------欢迎使用mini学生管理系统---------------");
		System.out.println("|                  1.查看学生总信息                               |");
		System.out.println("|                  2.添加学生信息                                   |");
		System.out.println("|                  3.修改学生成绩信息                            |");
		System.out.println("|                  4.删除学生信息                                   |");
		System.out.println("|                  5.查找学生信息                                   |");
		System.out.println("-----------------------------------------------------");
		System.out.print("请输入您需要的功能号：");
		//调用选择方法
		choice(scanf.nextInt());
	}
	public void choice(int n) {
		//生成StulistDemo对象，用于相关功能进行
		StulistDemo stu = new StulistDemo();
		//增强程序健壮性，排出其他乱码干扰程序进行（对于非法数字进行再输入）
		while(true) {
			if(n >= 1 && n <= 5)
				break;
			else {
				System.out.println("您所输入的号码无效，请重新输入！！！");
				System.out.print("请重新输入您需要的功能号：");
				n = scanf.nextInt();
			}
		}
		//开关语句选择相应的功能，然后调用其具体方法
		while(true){
			switch(n){
				case 1:stu.show(getHead());break;
				case 2:stu.add(getHead(),stu.create());break;
				case 3:stu.modifi(getHead());break;
				case 4:stu.delete(getHead());break;
				case 5:stu.find(getHead());break;
			}
			//创建死循环，完成功能后再次返回主页面
			show_index();
		}
	}
}
