package 力扣;

public class 有效的山脉数组优化 {
    public static void main(String[] args) {
        int[] arr = {3,5,5};
        System.out.print(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] A) {
        //当长度小于三直接返回false
        if(A.length < 3) {
            return false;
        }
        //当长度大于三时的情况
        else {
            int i = 1;
            //判断两种临界情况
            if (A[1] < A[0])
                return false;
            else if(A[A.length-1] > A[A.length-2])
                return false;
            //对于一般情况进行判断
            else {
                for(;i < A.length;i++){
                    if(A[i] == A[i-1])
                        return false;
                    if(A[i] < A[i-1])
                        break;
                }
                i++;
                for(;i < A.length;i++){
                    if(A[i] == A[i-1])
                        return false;
                    if(A[i] < A[i-1])
                        continue;
                    else
                        return false;
                }
            }
            return true;
        }
    }
}
