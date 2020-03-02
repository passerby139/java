package 数据结构_递归;

import java.util.Scanner;

public class 递归累加 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sum(in.nextInt()));
    }

    static int sum(int temp){
        int result;
        if(temp == 1)
            result = 1;
        else
            result = temp+sum(temp -1);
        return result;
    }
}
