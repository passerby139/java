package ö�ٷ���;

/*
 * �������ַ��������Դ���ö�ٶ�����Ȼ�ڶ��ַ���Ҫ�ù��ڵ�һ�ַ������������׳���ö���쳣�����³������ͨ�������г���
 */

public class ö�ٶ��󴴽� {
	public static void main(String[] args) {
		seasons2 c1 = seasons2.SPRING;
		seasons2 c2 = seasons2.valueOf("SPRING");
		
		
		seasons2 c3 = seasons2.SUMMER;
		seasons2 emun[] = seasons2.values();
		//compareTo()����������ö��Ԫ�ص�λ�ñȽϣ���Ϊ����СΪ����
		for(int i = 0;i < emun.length;i++) {
			System.out.println(c3+"��"+emun[i]+"�ĶԱȽ��Ϊ��"+c3.compareTo(emun[i]));
		}
		//ordinal()����������ö��Ԫ�ص�����о١�
		for(int i = 0;i < emun.length;i++) {
			System.out.println(emun[i]+"ö��Ԫ�ص�����λ��Ϊ��"+emun[i].ordinal());
		}
	}
}
