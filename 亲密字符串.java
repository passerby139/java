package 力扣;

import java.util.Arrays;

public class 亲密字符串 {
    public static void main(String[] args) {
        System.out.print(buddyStrings("abab", "abab"));
    }

    public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        } else if (A.length() < 2 || B.length() < 2) {
            return false;
        } else {
            int temp = 0;
            int k = 0;
            boolean flag = true;
            char[] arr = new char[5];
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    temp++;
                    if (temp > 2) {
                        flag = false;
                        break;
                    }
                    arr[k++] = A.charAt(i);
                    arr[k++] = B.charAt(i);
                }
            }
            if (temp == 0) {
                int t = 1;
                char[] brr = A.toCharArray();
                Arrays.sort(brr);
                for (; t < brr.length; t++) {
                    if (brr[t] - brr[t-1] == 0) {
                        break;
                    }
                }
                if (t == A.length())
                    flag = false;
            } else if (temp == 2) {
                if (arr[0] != arr[3] || arr[1] != arr[2])
                    flag = false;
            } else
                flag = false;
            return flag;
        }
    }
}
