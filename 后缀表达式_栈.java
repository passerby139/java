package 数据结构;

import java.util.Scanner;
import java.util.Stack;

public class 后缀表达式_栈 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		//创建对象
		CalculateDemo cal = new CalculateDemo(str);
		//调用相关方法
		cal.calculate();
	}
}

class CalculateDemo{
	private String str;

	public CalculateDemo(String str) {
		super();
		this.str = str;
	}
	
	public void calculate() {
		if(!examine(str))
			System.out.println("输入字符串中包含非法字符，无法识别！");
		else {
			//创建Stack类对象，指定范型
			Stack<Integer> stack = new Stack<Integer>();
			//循环依次遍历每一个元素
			try {
				for(int i = 0;i < str.length();i++) {
					//若是数字就进行压栈
					if('0' < str.charAt(i) && str.charAt(i) < '9') {
						stack.push((int)(str.charAt(i)-'0'));
					}
					//遇到运算符就弹出两个数据，注意数据先后顺序
					else if(str.charAt(i) == '+'){
						int y = stack.pop();
						int x = stack.pop();
						int z = x+y;
						stack.push(z);
					}
					//减法要额外考虑，因为数据可能会是负数
					else if(str.charAt(i) == '-'){
						if(i == (str.length()-1) || str.charAt(i+1) == ' ') {
							int y = stack.pop();
							int x = stack.pop();
							int z = x-y;
							stack.push(z);
						}
						else if('0' < str.charAt(i+1) && str.charAt(i+1) < '9') {
							stack.push(((int)(str.charAt(i+1)-'0')*-1));
							i++;
						}
					}
					else if(str.charAt(i) == '*'){
						int y = stack.pop();
						int x = stack.pop();
						int z = x*y;
						stack.push(z);
					}
					else if(str.charAt(i) == '/'){
						int y = stack.pop();
						int x = stack.pop();
						int z = x/y;
						stack.push(z);
					}
					i++;
				}
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();

			}
			System.out.println(stack.pop());
		}
	}
	//用于检验字符串是否包含非法字符
	public boolean examine(String temp) {
		for(int i = 0;i < temp.length();i++) {
			if('0' < temp.charAt(i) && temp.charAt(i) < '9')
				continue;
			else if(temp.charAt(i) == '+')
				continue;
			else if(temp.charAt(i) == '-')
				continue;
			else if(temp.charAt(i) == '*')
				continue;
			else if(temp.charAt(i) == '/')
				continue;
			else if(temp.charAt(i) == ' ')
				continue;
			else 
				return false;
		}
		return true;
	}
}