package 小练习;
/*
* 请编程求1*2*3*...*n所得的数末尾有多少个0？（n由键盘输入，1000<n<10000）
* */



import java.util.Scanner;

public class 计算阶乘末尾数0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long[] arr = new Long[6000];
        arr[0] = 1L;
        int n = in.nextInt();
        int k = 0,add = 0;
        long temp = 0L,flag;
        for (int i = 1; i < 6000; i++)
            arr[i] = 0L;
        for (int i = 1; i <= n; i++) {
            //进位寄存器
            temp = 0;
            for (k = 0; k < 6000; k++) {
                //数组每一元素*i，最大9999*9999，所以用long型数据定义
                long total;
                total = arr[k] * i + temp;
                arr[k] = total % 1000000;
                temp = total / 1000000;
            }
        }
        for (k--;k >= 0;k--){
            if (arr[k] == 0)
                continue;
            else
                break;
        }
        System.out.println("一共占用"+k+"个数组单元(以下为阶乘结果，+代表0)");
            for (; k >= 0; k--) {
                if (9999 < arr[k] && arr[k] < 100000)
                    System.out.print("+");
                else if (999 < arr[k] && arr[k] < 10000)
                    System.out.print("++");
                else if (99 < arr[k] && arr[k] < 1000)
                    System.out.print("+++");
                else if (9 < arr[k] && arr[k] < 100)
                    System.out.print("++++");
                else if (0 <= arr[k] && arr[k] < 10)
                    System.out.print("+++++");
                System.out.print(arr[k]);
            }
       System.out.println();
        for(int j = 0;;j++){
            if (arr[j] == 0)
                add = add+6;
            else{
                flag = arr[j];
                while(flag != 0){
                    if(flag % 10 == 0)
                        add++;
                    else
                        break;
                    flag = flag/10;
                }
                break;
            }
        }
        System.out.println("末尾一共有"+add+"个零！");
    }
}
