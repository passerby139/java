package 力扣;

import java.util.ArrayList;

public class 汉明距离优化 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        int arr[][] = change(x,y);
        int add = 0;
        int j = 0;
        for (j = 0; j < 35; j++) {
            add = add + Math.abs(arr[0][j] - arr[1][j]);
        }
        return add;
    }
    public static int[][] change(int x,int y) {
        int[][] arr = new int[35][35];
        int i = 0;
        int temp = x > y?x :y;
        while (temp != 0) {
            arr[0][i] = x % 2;
            arr[1][i++] = y % 2;
            x = x / 2;
            y = y / 2;
            temp = temp/2;
        }
        return arr;
    }
}
