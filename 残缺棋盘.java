package 算法;

import java.util.Scanner;

public class 残缺棋盘 {
    static int amount = 0;
    static int[][] qipan = new int[100][100];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dr = 0;
        int dc = 0;
        int size = 0;
        System.out.print("请输入棋盘大小：");
        size = in.nextInt();
        System.out.print("请输入残缺的位置：");
        dr = in.nextInt();
        dc = in.nextInt();
        cover(0,0,dr,dc,size);
        showqipan(size);
    }
    static void cover(int tr,int tc,int dr,int dc,int size){
        if(size < 2)
            return;
        int t = ++amount;
        int s = size/2;
        //判断残缺点在左上角的情况
        if(dr < tr + s && dc < tc + s){
            cover(tr,tc,dr,dc,s);
            qipan[tr+s-1][tc+s] = t;
            qipan[tr+s][tc+s] = t;
            qipan[tr+s][tc+s-1] = t;
            cover(tr,tc+s,tr+s-1,tc+s,s);
            cover(tr+s,tc,tr+s,tc+s-1,s);
            cover(tr+s,tc+s,tr+s,tc+s,s);
        }
        //判断残缺点在右上角的情况
        if(dr < tr + s && dc >= tc + s){
            cover(tr,tc+s,dr,dc,s);
            qipan[tr+s-1][tc+s-1] = t;
            qipan[tr+s][tc+s-1] = t;
            qipan[tr+s][tc+s] = t;
            cover(tr,tc,tr+s-1,tc+s-1,s);
            cover(tr+s,tc,tr+s,tc+s-1,s);
            cover(tr+s,tc+s,tr+s,tc+s,s);
        }
        //判断残缺点在左下角的情况
        if(dr >= tr + s && dc < tc + s){
            cover(tr+s,tc,dr,dc,s);
            qipan[tr+s-1][tc+s-1] = t;
            qipan[tr+s][tc+s] = t;
            qipan[tr+s-1][tc+s] = t;
            cover(tr,tc+s-1,tr+s-1,tc+s-1,s);
            cover(tr,tc+s,tr+s-1,tc+s,s);
            cover(tr+s,tc+s,tr+s,tc+s,s);
        }
        //判断残缺点在右下角的情况
        if(dr >= tr + s && dc >= tc + s){
            cover(tr+s,tc+s,dr,dc,s);
            qipan[tr+s-1][tc+s-1] = t;
            qipan[tr+s][tc+s-1] = t;
            qipan[tr+s][tc+s] = t;
            cover(tr,tc+s,tr+s-1,tc+s-1,s);
            cover(tr,tc+s,tr+s-1,tc+s,s);
            cover(tr+s,tc,tr+s,tc+s-1,s);
        }
    }
    static void showqipan(int size){
        for (int i = 0; i < size; i++) {
            for(int j = 0;j < size;j++){
                System.out.print(qipan[i][j]+" ");
            }
            System.out.println();
        }
    }
}
