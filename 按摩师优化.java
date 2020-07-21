package 力扣;

public class 按摩师优化 {
    static int brr[] = new int[200];
    public static void main(String[] args) {
        int arr[] = {2,7,9,3,1};
        System.out.println(massage(arr));
    }
    public static int massage(int[] nums) {
        for (int i = 0; i < brr.length; i++)
            brr[i] = -1;
        int res = findMax(0,nums);
        return res;
    }
    public static int findMax(int i,int[] arr){
        int res = 0;
        if (i >= arr.length){
            return res;
        }
        for (int j = i; j < i+3; j++) {
            if (j == arr.length){
                break;
            }
            if (brr[j] == -1){
                brr[j] = arr[j]+findMax(j+2,arr);
            }
            System.out.print(brr[j]+"-");
            if(brr[j] > res){
                res = brr[j];
            }
        }
        System.out.println("->"+res);
        return res;
    }
}
