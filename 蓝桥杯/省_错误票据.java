package 蓝桥杯;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class 省_错误票据 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<Integer>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0;i < n;i++){
            String list = in.nextLine();
            String[] split = list.split(" ");
            for(int j = 0;j < split.length;j++)
                li.add(Integer.parseInt(split[j]));
        }
        Collections.sort(li);
        int a = 0;int b = 0;
        for(int i = 1;i < li.size();i++){
            if(li.get(i) - li.get(i-1) == 2)
                a = li.get(i) -1;
            if(li.get(i).equals(li.get(i-1)))
                b = li.get(i);
        }
        System.out.println(a+" "+b);
    }
}
