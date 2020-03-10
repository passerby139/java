package 蓝桥杯;

import java.math.BigDecimal;
import java.math.BigInteger;

public class 省_黄金连分数 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 3;i < 400;i++){
            BigInteger t = b;
            b = a.add(b);
            a = t;
        }
        BigDecimal dvi = new BigDecimal(a,110).divide(new BigDecimal(b,110),BigDecimal.ROUND_HALF_DOWN);
        System.out.println(dvi.toPlainString().substring(0,103));
    }
}
