package leeCode;

import java.util.*;

public class 最接近原点的K个点 {
	public static void main(String[] args) {
		int[][] points = {{1,3},{-2,2}};
		points=kClosest(points, 1);
		for(int[] temp:points) {
			System.out.println(temp[0]+"-"+temp[1]);
		}
	}
    public static int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
            }
        });
        return Arrays.copyOfRange(points, 0, K);
    }
}
