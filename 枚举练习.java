package ö�ٷ���;

/*
 * ʹ�÷��͵ĺô������ڿ��Ա������������뵼�±���ͨ����ȷ���ܵó���ȷ�����
 */

public class ö����ϰ {
	public static void doit(seasons2 s) {
		switch(s) {
		case SPRING:
			System.out.println("This is ����");
			break;
		case SUMMER:
			System.out.println("This is ����");
			break;
		case WINTER:
			System.out.println("This is ����");
			break;
		case AUTUMN:
			System.out.println("This is ����");
			break;
		}
	}
	public static void main(String[] args) {
		doit(seasons2.SUMMER);
		seasons2 enumArrary[] = seasons2.values();
	/*	
		for(int i = 0;i < enumArrarys.length;i++ ) {
			System.out.println("ö������:" + enumArrarys[i]);
		}
	*/	
		for(seasons2 tem:enumArrary) {
			System.out.println("ö������(for each):" + tem);
		}
	}
}
