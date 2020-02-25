package ���ݽṹ;

import java.util.Scanner;
import java.util.Stack;

public class ��׺���ʽ_ջ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		//��������
		CalculateDemo cal = new CalculateDemo(str);
		//������ط���
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
			System.out.println("�����ַ����а����Ƿ��ַ����޷�ʶ��");
		else {
			//����Stack�����ָ������
			Stack<Integer> stack = new Stack<Integer>();
			//ѭ�����α���ÿһ��Ԫ��
			try {
				for(int i = 0;i < str.length();i++) {
					//�������־ͽ���ѹջ
					if('0' < str.charAt(i) && str.charAt(i) < '9') {
						stack.push((int)(str.charAt(i)-'0'));
					}
					//����������͵����������ݣ�ע�������Ⱥ�˳��
					else if(str.charAt(i) == '+'){
						int y = stack.pop();
						int x = stack.pop();
						int z = x+y;
						stack.push(z);
					}
					//����Ҫ���⿼�ǣ���Ϊ���ݿ��ܻ��Ǹ���
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();

			}
			System.out.println(stack.pop());
		}
	}
	//���ڼ����ַ����Ƿ�����Ƿ��ַ�
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