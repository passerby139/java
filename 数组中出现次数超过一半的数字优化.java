package 力扣;

import java.util.Arrays;

public class 数组中出现次数超过一半的数字优化 {
    public static void main(String[] args) {
        int[] arr = {-1,-1,2147483647};
        System.out.print(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int temp = Integer.MAX_VALUE;
        int add = 1;
        int l = nums.length/2;
        Arrays.sort(nums);
        for (int num:nums) {
            if (num != temp){
                temp = num;
                add = 1;
            }else {
                add++;
            }
            if(add > l)
                break;
        }
        return temp;
    }
}
