package 力扣;

import java.math.BigInteger;

/**
 * 1.应该找出1-n中有多少质数
 * 2.给非质数做全排列
 * 3.排列完的值乘以质数的全排列
 * 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
 */
public class 质数排列 {
    public static void main(String[] args) {
        System.out.print(numPrimeArrangements(1));
    }
    public static int numPrimeArrangements(int n) {
        int[] flag = {0,1,1,0,1,0,1,0,0,0,
                      1,0,1,0,0,0,1,0,1,0,
                      0,0,1,0,0,0,0,0,1,0,
                      1,0,0,0,0,0,1,0,0,0,
                      1,0,1,0,0,0,1,0,0,0,
                      0,0,1,0,0,0,0,0,1,0,
                      1,0,0,0,0,0,1,0,0,0,
                      1,0,1,0,0,0,0,0,1,0,
                      0,0,1,0,0,0,0,0,1,0,
                      0,0,0,0,0,0,1,0,0,0};
        BigInteger res = new BigInteger("1");
        long t = (int)Math.pow(10,9)+7;
        BigInteger math = new BigInteger(String.valueOf(t));
        int add = 0;
        for (int i = 0; i < n; i++) {
            if(flag[i] == 1)
                add++;
        }
        int bdd = n-add;
        while (add > 1){
            BigInteger temp = new BigInteger(String.valueOf(add));
            res = res.multiply(temp);
            add--;
        }
        while (bdd > 1){
            BigInteger temp = new BigInteger(String.valueOf(bdd));
            res = res.multiply(temp);
            bdd--;
        }
        res = res.remainder(math);
        return res.intValue();
    }
}
