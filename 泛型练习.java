package ö�ٷ���;

public class ������ϰ<T> {
	T num;
	
	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	public static void main(String[] args) {
		������ϰ<Boolean> use = new ������ϰ<Boolean>();
		
		use.setNum(true);
		boolean b= use.getNum();
		System.out.println(b);
	}
}
