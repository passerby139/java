package 力扣;

import java.util.ArrayList;

public class 汉明距离 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        Object arr[] = change(x);
        Object brr[] = change(y);
        int add = 0;
        int j = 0;
        int min = arr.length < brr.length ? arr.length:brr.length;
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        */
        for (j = 0; j < min; j++) {
            add = add + Math.abs((int)arr[j] - (int)brr[j]);
        }
        if(min == arr.length){
            for (; j < brr.length; j++) {
                if((int)brr[j] == 1)
                    add++;
            }
        }
        else {
            for (; j < arr.length; j++) {
                if((int)arr[j] == 1)
                    add++;
            }
        }
        return add;
    }
    public static Object[] change(int x) {
        ArrayList list = new ArrayList();
        int i = 0;
        while (x != 0) {
            list.add(x % 2);
            x = x / 2;
        }
        Object arr[] = list.toArray();
        return arr;
    }
}
