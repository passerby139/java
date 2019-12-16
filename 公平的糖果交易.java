package Lee_code;
public class 公平的糖果交易 {
	public static void main(String[] args) {
		int[] A = {1,2}; 
		int[] B = {2,3}; 
		int add1 = 0;
		int add2 = 0;
		int[] ans = {0,0};
		for(int m = 0;m < A.length;m++)
			add1 = add1 + A[m];
		for(int n = 0;n < B.length;n++)
			add2 = add2 + B[n];
		System.out.println(add1);
		System.out.println(add2);
		for(int i = 0;i < A.length;i++) {
			for(int j = 0;j < B.length;j++) {
				if((add1-A[i]+B[j]) == (add2+A[i]-B[j])) {
					ans[0] = A[i];
					ans[1] = B[j];
				}
			}
		}
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
    }
}
