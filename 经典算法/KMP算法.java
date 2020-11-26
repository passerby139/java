package �����㷨;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * KMP����A,B�����ַ��������B�ַ�����A�ַ������е�һ�γ��ֵ�λ�õ����Ž��㷨
 *
 * 1.���Ȳ�����Ч�����⣬�������뵽�ı����㷨��������˫ָ��i,j���ֱ�ָ�������ַ�������ĳλԪ��
 * ���ʱ������ͬʱ�ƶ�i,jָ�룬����ͬ������ƶ�i��ָ��Ȼ��j��λΪ0�����±Ƚϡ�
 * 
 * 2.���Ǿ�˼����������ÿ�ι�λΪ0�������±Ƚϣ����������˺ܴ���ظ����������������㷨������Ч�ʣ�
 * �ܲ��ܵ�Ԫ�ز����ʱ��������j����ĳһ�ض�λ�ã��������ٴ������ظ����������ʱ�����ǾͿ�������KMP
 * �㷨�����������������ַ��������ǰ׺������׺��ȵ������ʹ��next������м�¼��ÿ��j����ת��λ�á�
 * 
 * 3.next[i]��ָB�ַ�����iλԪ����ǰ����ȵ�ǰ׺�ͺ�׺����󳤶ȣ���A,B�ַ�����iλʱ�����ֲ��ȣ���ֱ
 * ��������next[i]λ���Ϳɼ��������Բ���ͬ������ظ��ݹ顣
 */
public class KMP�㷨 {
	//���ģʽ�����е�next��¼����
	public static int[] next(int[] next,String str) {
		//��iΪ��Ԫ��ʱ������󹫹�ǰ׺�͹�����׺�����Ը�ֵ-1
		next[0] = -1;
		//kΪһ����¼���ȵı���
		int k  = -1;
		//j������¼ĳһԪ�أ��Ա����
		int j = 0;
		while(j < str.length()-1) {
			//��k����-1����Ϊ��Ԫ�أ����Ⱥ��±��ͬʱ��1
			//����ǰj-1���ַ�����󹫹�ǰ׺����һλ��ȣ���󹫹�ǰ��׺���ȿ�ֱ�Ӽ�1
			//��: a b c d e a b c d f a d
			//���赱ǰj-1Ϊ 7 �����ַ���d����
			//j-1����󹫹�ǰ��׺����Ϊ2�����ǾͱȽ�strb.charAt(2)��strb.charAt(7)
			//��ΪͬΪ�ַ���c��������j��Ԫ�ص���󹫹��ִ�����Ϊk+1����3
			//��next[8] = 3
			if(k == -1 || str.charAt(j) == str.charAt(k)) {
				++k;
				++j;
				next[j] = k;
			}
			//���������Ƶ�����ȣ���k�������󹫹�ǰ׺��ֵ���ݹ����ж�
			else {
				k = next[k];
			}
		}
		return next;
	}
	public static int KMP(String stra,String strb,int[] next) {
		//��������˫ָ���¼
		int i = 0,j = 0;
		while(i < stra.length()) {
			//������-1˵������󹫹�ǰ׺�ͺ�׺ֱ���൱�ڱ�������j�ع���0
			//�������i��jͬʱ+1
			if(j == -1 || stra.charAt(i) == strb.charAt(j)) {
				++i;
				++j;
			}
			//�������KMP�㷨�ĺ��ģ�ͨ����¼����nextʹ��jָ�벻��ֱ���������ַ����±Ƚ�
			else {
				j = next[j];
			}
			//��j����ģʽ������ʱ˵���Ƚ���ɣ����Է��ش�
			if(j == strb.length()) {
				int ans = i - strb.length();
				return ans+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String stra = in.next();
		String strb = in.next();
		int[] temp = new int[strb.length()];
		int[] next = next(temp,strb);
		for(int i = 0;i < next.length;i++) {
			System.out.print(strb.charAt(i)+"-"+next[i]+"   ");
		}
		System.out.println(KMP(stra,strb,next));
	}
}
