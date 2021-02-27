package leeCode;

public class 递增的三元子序列 {
	public static void main(String[] args) {
		int[] num = {2,1,5,0,4,6};
		System.out.println(increasingTriplet(num));
	}
    public static boolean increasingTriplet(int[] nums) {
    	boolean flag = false;
    	for(int i = 0;i < nums.length;i++) {
    		for(int j = i;j < nums.length;j++) {
    			if(nums[i] < nums[j]) {
        			for(int k = j;k < nums.length;k++) {
        				if(nums[j] < nums[k]) {
        					flag = true;
        					break;
        				}
        			}
    			}
    		}
    	}
    	return flag;
    }
}
