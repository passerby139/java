package �����㷨;

import java.util.Scanner;

public class �ַ���ȫ���� {
	static int[] flag = new int[10];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Permutation(str.toCharArray(),0,str.length()-1);
	}
	//�ж��Ƿ��ظ�ֵ
	public static boolean IsSwap(char[] str,int from,int to) {
		boolean res = true;
		for(int i = from;i < to;i++) {
			if(str[to] == str[i]) {
				res = false;
				break;
			}
		}
		return res;
	}
	public static void Permutation(char[] str,int from,int to) {
		//����ַ�������Ϊһ��ֱ�����������������
		if(from == to) {
			for(int i = 0;i < str.length;i++) {
				System.out.print(str[i]);
			}
			System.out.println();
			return;
		}
		else {
			//����ѭ�������ַ�����ÿһ������
			for(int i = from;i <= to;i++) {
				if(!IsSwap(str,from,i))
					continue;
				char temp = str[i];
				str[i] = str[from];
				str[from] = temp;
				Permutation(str, from+1, to);
				//������ɺ�Ҫ�ع�ԭ��
				temp = str[from];
				str[from] = str[i];
				str[i] = temp;
				
			}
		}
	}
}
