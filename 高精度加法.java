package 蓝桥杯;

import java.util.Scanner;

public class 高精度加法 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//开辟长数组存储大数据
		String A;
		String B;
		char[] a = new char[105];
		char[] b = new char[105];
		int[] C = new int[105];
		int temp =0;
		int n = 104;
		
		A = scanf.next();
		B = scanf.next();
		
		a = A.toCharArray();
		b = B.toCharArray();
		
		for(int j = a.length-1,k = b.length-1;;j--,k--,n--) {
			C[n] = (a[j]-'0') + (b[k]-'0') + temp;
			temp = 0;
				//对于进位做的判断
			if(C[n] >= 10) {
				temp = C[n]/10;
				C[n] = C[n]%10;
			}
			if(j == 0 && k ==0 ) {
				n--;
				C[n] = temp;
				break;
			}
			if(j == 0 ) {
				k--;n--;
				while(k >= 0) {
					C[n] = (b[k]-'0') + temp;
					temp = 0;
					if(C[n] >= 10) {
						temp = C[n]/10;
						C[n] = C[n]%10;
					}
					k--;n--;
				}
				break;
			}
			if(k == 0 ) {
				j--;n--;
				while(j >= 0) {
					C[n] = (a[j]-'0') + temp;
					temp = 0;
					if(C[n] >= 10) {
						temp = C[n]/10;
						C[n] = C[n]%10;
					}
					j--;n--;
				}
				break;
			}
		}
		//找到大数据的第一个数字位置
		for(int j = 0;j <= 104;j++) {
			if(C[j] != 0) {
				temp = j;
				break;
			}
		}
		for(int j = temp;j <= 104;j++) {
			System.out.print(C[j]);
		}
	}
}
