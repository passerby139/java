package 力扣;

public class 按摩师 {
    public static void main(String[] args) {
        int arr[] = {2,7,9,3,1};
        System.out.println(massage(arr));
    }
    public static int massage(int[] nums) {
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
            int t = j+2;
            int temp = arr[j]+findMax(j+2,arr);
            //System.out.print(temp+"-");
            if(temp > res){
                res = temp;
            }
        }
        //System.out.println("->"+res);
        return res;
    }
}
