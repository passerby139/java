package �����㷨;

/**
 * ����Manacher�㷨�ǽ��Ѱ���������ִ���������Ž�
 * 
 * 1.����㷨�������öԳ����������Ƚ���⣬�ڴ�Χ����С��Χ
 * ����������������Ĵ����жϣ�һ�����Ƕ����������ۣ���Ϊ���ȵ���ż�Ծ������㷨�ķ�֧
 * �����ȼ���һ������Ϊn���ַ������м�ض���n-1�����ӣ������á�#�����棬������ӣ����Ǿ�
 * ���Եõ�һ���µĳ���Ϊ2n-1���ַ����������ٸ��ַ�������λ�ֱ���ϡ�$������ֹԽ������(��
 * ����java��cʵ��ʱ���������죬c�ַ���ĩβһ���ԡ�/0����������java������ˣ���������Ҫ��
 * ĩβ���ϡ�/0������)
 * 
 * 2.�����֮����ַ��������ǵĳ��ȶ�Ϊ2n+1�����������Կ���ͳһ���������������ҳ��Ե�
 * ��Ԫ��Ϊ����ʱ�����ĵ����뾶�Ƕ���,���չ��ɣ���дp���飬��Ѱ�ҳ�p�����ֵ-1������
 * ���ҵ����������ִ�
 * 
 */



import java.util.Scanner;

public class Manacher�㷨 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str  = in.next();
		char[] arr = new char[2*str.length()+3];
		int[] p = new int[2*str.length()+3];
		//�����ַ���
		arr[0] = '$';
		arr[2*str.length()+1] = '\0';
		int j = 0;
		for(int i = 1;i < arr.length-1;i++) {
			arr[i++] = '#';
			if(i >= arr.length-1)
				break;
			arr[i] = str.charAt(j++);
		}
		manacher(arr,p);
	}
	public static void manacher(char[] str,int[] p) {
		int[][] max = {{0,0}};
		int size = str.length;
		p[0] = 1;
		int id = 0;
		int mx = 1;
		for(char i:str) {
			System.out.print(i+" ");
		}
		for(int i = 1;i < size-1;i++) {
			if(mx > i) {
				p[i] = Math.min(p[2*id-i], mx-i);
			}
			else {
				p[i] = 1;
			}
			for(;str[i+p[i]] == str[i-p[i]];p[i]++);
			if(mx < i+p[i]) {
				mx = i+p[i];
				id = i;
			}
			if(max[0][0] < p[i]){
				max[0][0] = p[i];
				max[0][1] = i;
			}
		}
		System.out.println();
		for(int i = max[0][1]-max[0][0]+2;i < max[0][1]+max[0][0];i=i+2) {
			System.out.print(str[i]);
		}
		System.out.println("���������ִ�������Ϊ��"+(max[0][0]-1));
	}

}
