package 经典算法;

import java.util.*;

public class 类排序练习 {
	public static void main(String[] args) {
		List<student> list = new ArrayList<student>();
		student stu1 = new student(2,"jack");
		student stu2 = new student(6,"sam");
		student stu3 = new student(3,"alin");
		student stu4 = new student(1,"timi");
		student stu5 = new student(9,"aers");
		student stu6 = new student(3,"wefd");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		list.add(stu6);
		for(student temp:list)
			System.out.println(temp.toString());
		System.out.println("*******************************************************");
		Collections.sort(list);
		for(student temp:list)
			System.out.println(temp.toString());
	}
}

class student implements Comparable<student>{
	int age;
	String name;
	public student(int age,String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(student stu) {
		return stu.age -this.agea
				;
	}
	public String toString() {
		return "当前学生年龄为："+this.age +"当前学生姓名为："+this.name;
	}
}