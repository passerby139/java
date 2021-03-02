package leeCode;

public class 最小路径和 {
	public static void main(String[] args) {
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(grid));
	}
    public static int minPathSum(int[][] grid) {
    	int[] res = {Integer.MAX_VALUE}; 
    	findPathSum(grid, 0, 0, grid[0][0],res);
    	return res[0];
    }
    public static void findPathSum(int[][] arr,int i,int j,int now,int[] res) {
        if(j == arr[0].length-1 && i == arr.length-1) {
    		if(now < res[0]) {
    			res[0] = now;
    			return ;
    		}
    	}
    	if(j + 1 < arr[0].length && now + arr[i][j+1] < res[0])
    		findPathSum(arr, i, j+1, now + arr[i][j+1],res);
    	if(i + 1 < arr.length && now + arr[i+1][j] < res[0])
    		findPathSum(arr, i+1, j, now + arr[i+1][j],res);
    	return ;
    }
}
