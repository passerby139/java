package 力扣;

/**
 * 1.找出最大值的位置
 * 2.以此为分界线挨个判断是否满足条件
 * 3.判断临界问题
 */
public class 有效的山脉数组 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.print(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] A) {
        //当长度小于三直接返回false
        if(A.length < 3) {
            return false;
        }
        //当长度大于三时的情况
        else {
            int max = Integer.MIN_VALUE;
            int flag = 0;
            //找出最大值的位置
            for (int i = 0; i < A.length; i++) {
                if(A[i] == max){
                    return false;
                }
                if(A[i] > max){
                    max = A[i];
                    flag = i;
                }
            }
            //最大值的临界问题判断
            if(flag == 0){
                return false;
            }
            else if (flag == A.length-1){
                return false;
            }
            else {
                for (int i = 1; i < flag; i++) {
                    if(A[i] > A[i-1])
                        continue;
                    else
                        return false;
                }
                for (int i = A.length-2; i > flag; i--) {
                    if(A[i] > A[i+1])
                        continue;
                    else
                        return false;
                }
            }
            return true;
        }
    }
}
