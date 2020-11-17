package leeCode;

import java.util.*;

public class 连续的子数组和 {
	public static void main(String[] args) {
		int[] arr = {1,2,12};
		checkSubarraySum(arr, 6);
	}
    public static boolean checkSubarraySum(int[] nums, int k) {
    	if(nums.length < 2)
    		return false;
    	boolean flag = false;
        	for(int i = 0;i < nums.length;i++) {
        		int res = 0;
	    		int total = 0;
        		for(int j = i;j < nums.length;j++) {
        			res += nums[j];
	    			if(nums[j] == 0) 
	    				total++;
	    			else
	    				total = 0;
	    			if(total == 2) {
	    				flag = true;
        				System.out.println(i+"----"+j+"-----"+res);
	    		    	return flag;
	    			}
        			if(k != 0 && res % k == 0 && res != 0 && j-i >= 1) {
        				System.out.println(i+"----"+j+"-----"+res);
        				flag = true;
        		    	return flag;
        			}
        		}
        	}
    	return flag;
    }
}
