package 蓝桥杯;

import java.util.Scanner;

import java.util.Scanner;

public class 猴子吃包子 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int z1=sc.nextInt();
        int p=sc.nextInt();

        double sum=x1/x+y1/y+z1/z;
        System.out.printf("%.2f",sum);
    }
}