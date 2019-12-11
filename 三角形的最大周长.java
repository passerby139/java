package Lee_code;

import java.util.Arrays;
import java.util.Scanner;

public class 三角形的最大周长 {
	public static void main(String[] args) {
		int[] A = {2,1,2};
		
		Arrays.sort(A);
        for(int i = A.length - 1; i >= 2; i--) {
            int a = A[i];
            int b = A[i - 1];
            int c = A[i - 2];
            if(a < b + c){
                System.out.println( a + b + c);
            }
        }
        System.out.println(0);
		
	}
}
