package 枚举范型;

/*
 * 使用范型的好处，在于可以避免多余参数传入导致编译通过，确不能得出正确结果。
 */

public class 枚举练习 {
	public static void doit(seasons2 s) {
		switch(s) {
		case SPRING:
			System.out.println("This is 春天");
			break;
		case SUMMER:
			System.out.println("This is 夏天");
			break;
		case WINTER:
			System.out.println("This is 冬天");
			break;
		case AUTUMN:
			System.out.println("This is 秋天");
			break;
		}
	}
	public static void main(String[] args) {
		doit(seasons2.SUMMER);
		seasons2 enumArrary[] = seasons2.values();
	/*	
		for(int i = 0;i < enumArrarys.length;i++ ) {
			System.out.println("枚举内容:" + enumArrarys[i]);
		}
	*/	
		for(seasons2 tem:enumArrary) {
			System.out.println("枚举内容(for each):" + tem);
		}
	}
}
