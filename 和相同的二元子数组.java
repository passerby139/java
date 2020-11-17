package leeCode;

import java.util.*;

public class 和相同的二元子数组 {
	public static void main(String[] args) {
		int[] a = {1,0,1,0,1};
		numSubarraysWithSum(a, 2);
	}
	public static int numSubarraysWithSum(int[] A, int S) {
        int N = A.length;
        int[] P = new int[N + 1];
        for (int i = 0; i < N; ++i)
            P[i+1] = P[i] + A[i];

        Map<Integer, Integer> count = new HashMap();
        int ans = 0;
        for (int x: P) {
        	//若发现前数组和有前面存入A[i]+S的长度，就读一下他有多少个
            ans += count.getOrDefault(x, 0);
            //存入当前数组和加上s后的数组和应有长度，并加一
            count.put(x+S, count.getOrDefault(x+S, 0) + 1);
            System.out.println(ans+"------"+count.toString());
        }

        return ans;
    }
}
/**
 * 若前两项和为1，当它加上S后应该找到一个前数组和为3的值，就给map存入(3,total+1),若后面真的有数组和为3就读出total值，若没有则弃之。
 * 反复累加即可。
 */
