package 蓝桥杯;

import java.util.Scanner;

public class 省_幸运数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //定义范围上下限
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[m/2];
        //先做一轮筛选，将数组都填上奇数
        for (int i = 0; i < m/2; i++)
            arr[i] = i*2+1;
        //开始依次进行幸运数筛选
        int k = 1;
        while (true){
            //arr[K]中存放的即为幸运数，当他的大小超过数组长度，就可以结束循环
            if(arr[k] > m/2)
                break;
            //设置计数器
            int add = 0;
            //遍历依次筛选幸运数
            for (int i = 0; i < m/2; i++) {
                if(arr[i] == 0)
                    continue;
                add++;
                if(add % arr[k] == 0){
                    add = 0;
                    arr[i] = 0;
                }
            }
            k++;
            while (arr[k] == 0) k++;
        }
        //找到上限指针
        int flag = 0;
        for (int i = 0; i < m/2; i++) {
            if(arr[i] >= n){
                flag = i;
                break;
            }
        }
        //从上限开始依次遍历累加，计算幸运数个数
        int add = 0;
        for (int i = flag; i < m/2; i++) {
            if(arr[i] == 0 || arr[i] == n)
                continue;
            else{
                if(arr[i] >= m)
                    break;
                add++;
            }
        }
        System.out.print(add);
    }
}
