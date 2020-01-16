package Ã¶¾Ù·¶ĞÍ;

public class ·ºĞÍÁ·Ï°<T> {
	T num;
	
	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	public static void main(String[] args) {
		·ºĞÍÁ·Ï°<Boolean> use = new ·ºĞÍÁ·Ï°<Boolean>();
		
		use.setNum(true);
		boolean b= use.getNum();
		System.out.println(b);
	}
}
