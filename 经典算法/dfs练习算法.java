package 经典算法;

import java.util.*;
public class dfs练习算法 {
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();//输入地图多高
		m = in.nextInt();//输入地图多宽
		int[][] map = new int[n][m];//存储地图
		boolean end = false;
		
		//输入地图
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				map[i][j] = in.nextInt();
			}
		}
		if(dfs(0,0,map)) {
			//输出地图
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					System.out.print(map[i][j]+"   ");
				}
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}else {
			System.out.println(11);
		}
	}
	//深度遍历地图算法
	public static boolean dfs(int x,int y,int[][] map){
		if(map[n-1][m-1] != 0) {
			return true;
		}else {
			if(0 <= x && x < n && 0 <= y && y < m) {
				if(map[x][y] == 0) {
					map[x][y] = 2;
					if(dfs(x+1,y,map)) {
						return true;
					}
					else if(dfs(x,y+1,map)) {
						return true;
					}
					else if(dfs(x-1,y,map)) {
						return true;
					}
					else if(dfs(x,y-1,map)) {
						return true;
					}else {
						map[x][y] = -1;
						return false;
					}
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
	}
}
	
