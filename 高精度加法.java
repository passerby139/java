package ���ű�;

import java.util.Scanner;

public class �߾��ȼӷ� {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//���ٳ�����洢������
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
				//���ڽ�λ�����ж�
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
		//�ҵ������ݵĵ�һ������λ��
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
