package 算法;

import java.util.Scanner;

public class 汉诺塔 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        hanoi(n,'A','B','C');
    }
    static void hanoi(int n,char a,char b,char c){
        if(n > 0){
            hanoi(n-1,a,c,b);
            System.out.println("Move dish "+n+" from pile "+a+" to "+b);
            hanoi(n-1,c,b,a);
        }
    }
}
