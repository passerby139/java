package leeCode;

import java.math.BigDecimal;

public class 子串能表示从1到N数字的二进制串 {
	public static void main(String[] args) {
		System.out.println(queryString("1", 1));
	}
    public static boolean queryString(String S, int N) {
    	boolean flag = true;
    	Integer num = new Integer("1");
		String str = num.toBinaryString(N);
		int j = 0;
		if(str.length() > S.length())
			return false;
    	for(int i = N;i >= 0;i--) {
    		str = num.toBinaryString(i);
    		char first = str.charAt(0);
    		for(j = 0;j < S.length();j++) {
    			if(S.charAt(j) == first) {
    				if(j+str.length() > S.length()) {
    					j = S.length();
    					break;
    				}
    				String temp = "";
    				for(int k = j;k < j+str.length();k++)
    					temp += S.charAt(k);
    				System.out.println(temp+"+++"+str);
    				BigDecimal num1 = new BigDecimal(temp);
    		        BigDecimal num2 = new BigDecimal(str);
    		        BigDecimal num3 = num1.subtract(num2);
    				if(num3.intValue() == 0) {
    					break;
    				}
    				else{
    					continue;
    				}
    			}
    		}
    		if(j == S.length()) {
    			flag = false;
    			break;
    		}
    	}
    	return flag;
    }
}
