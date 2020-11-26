package �����㷨;

import java.util.*;
public class dfs��ϰ�㷨 {
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();//�����ͼ���
		m = in.nextInt();//�����ͼ���
		int[][] map = new int[n][m];//�洢��ͼ
		boolean end = false;
		
		//�����ͼ
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				map[i][j] = in.nextInt();
			}
		}
		if(dfs(0,0,map)) {
			//�����ͼ
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
	//��ȱ�����ͼ�㷨
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
	
