package leeCode;

public class 免重复字母的最小删除成本 {
	public static void main(String[] args) {
		int[] cost = {4,9,3,8,8,9};
		System.out.println(minCost("bbbaaa", cost));
	}
    public static int minCost(String s, int[] cost) {
    	int i = 1;
    	int sum = 0;
    	for(;i < s.length();i++) {
    		if(s.charAt(i) == s.charAt(i-1)) {
    			int temp = cost[i-1];
    			sum += cost[i-1];
        		for(int j = i;j < s.length();j++) {
        			if(s.charAt(j) == s.charAt(i-1)) {
            			i++;
            			temp = Math.max(cost[j], temp);
            			sum += cost[j];
        			}else
        				break;
        		}
        		sum -= temp;
    		}
    	}
    	return sum;
    }
}
