package 枚举范型;

/*
 * 以下两种方法都可以创建枚举对象，显然第二种方法要好过于第一种方法，避免了抛出空枚举异常，导致程序编译通过而运行出错。
 */

public class 枚举对象创建 {
	public static void main(String[] args) {
		seasons2 c1 = seasons2.SPRING;
		seasons2 c2 = seasons2.valueOf("SPRING");
		
		
		seasons2 c3 = seasons2.SUMMER;
		seasons2 emun[] = seasons2.values();
		//compareTo()方法是用于枚举元素的位置比较，大为正，小为负。
		for(int i = 0;i < emun.length;i++) {
			System.out.println(c3+"和"+emun[i]+"的对比结果为："+c3.compareTo(emun[i]));
		}
		//ordinal()方法是用于枚举元素的输出列举。
		for(int i = 0;i < emun.length;i++) {
			System.out.println(emun[i]+"枚举元素的所在位置为："+emun[i].ordinal());
		}
	}
}
