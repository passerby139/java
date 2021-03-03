package leeCode;

import java.util.HashMap;
import java.util.Map;

public class 数组的度 {
	public static void main(String[] args) {
		int[] arr = {499999,0,0};
		System.out.println(findShortestSubArray(arr));
	}
    public static int findShortestSubArray(int[] nums) {
    	if(nums.length <= 1)
    		return nums.length;
    	Map<Integer, int[]> map = new HashMap<Integer,int[]>();
    	int res = Integer.MIN_VALUE;
    	int flag = -1;
    	int data = -1;
    	for(int i = 0;i < nums.length;i++){
    		if(map.get(nums[i]) == null) {
    			int[] arr = {i,0,0};
    			map.put(nums[i], arr);
    		}else {
    			int[] temp = map.get(nums[i]);
    			map.get(nums[i])[1] = i;
    			map.get(nums[i])[2]++;
    			if(map.get(nums[i])[2] == res) {
    				if(temp[1] - temp[0] < data/*map.get(flag)[1] - map.get(flag)[0]*/)
    					data = temp[1] - temp[0];
    			}else if(temp[2] > res) {
    				data = temp[1] - temp[0];
    				res = temp[2];
    			}
    		}
    	}
    	if(data >= 0)
    		return data+1;
    	else
    		return 1;
    }
}
