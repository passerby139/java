package leeCode;

import java.util.*;

public class ����ͬ�Ķ�Ԫ������ {
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
        	//������ǰ�������ǰ�����A[i]+S�ĳ��ȣ��Ͷ�һ�����ж��ٸ�
            ans += count.getOrDefault(x, 0);
            //���뵱ǰ����ͼ���s��������Ӧ�г��ȣ�����һ
            count.put(x+S, count.getOrDefault(x+S, 0) + 1);
            System.out.println(ans+"------"+count.toString());
        }

        return ans;
    }
}
/**
 * ��ǰ�����Ϊ1����������S��Ӧ���ҵ�һ��ǰ�����Ϊ3��ֵ���͸�map����(3,total+1),����������������Ϊ3�Ͷ���totalֵ����û������֮��
 * �����ۼӼ��ɡ�
 */
