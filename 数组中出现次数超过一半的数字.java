package 力扣;

public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        int[] arr = {-1,-1,2147483647};
        System.out.print(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int temp = nums.length/2;
        int res = 0;
        for (int num:nums) {
            if(num < min)  min = num;
            if(num > max)  max = num;
        }
        System.out.println(min);
        System.out.println(max);
        int[] arr = new int[max-min+1];
        for (int num:nums) {
            arr[num-min] += 1;
        }
        for (int num:nums) {
            if(arr[num - min] > temp){
                res = num;
                break;
            }
        }
        return res;
    }
}
