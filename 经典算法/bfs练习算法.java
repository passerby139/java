package 经典算法;

import java.util.*;
public class bfs练习算法 {
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();//输入地图多高
		m = in.nextInt();//输入地图多宽
		int[][] map = new int[n][m];//存储地图
		int[][] flag = new int[n][m];//存储标记数组
		boolean end = false;
		
		//输入地图
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				map[i][j] = in.nextInt();
			}
		}
		
		//创建队列来判断遍历的顺序
		Queue<testNode> queue = new LinkedList();
		//创建第一个节点
		testNode first = new testNode(0,0);
		queue.add(first);
		//方向数组
		int[] dirx = {1,0,-1,0}; 
		int[] diry = {0,1,0,-1}; 
		//开始循坏遍历队列
		while(!queue.isEmpty()) {
			testNode temp = queue.poll();
			//对这一个点进行四个方向判断出口
			for(int i = 0;i < 4;i++) {
				int nx = temp.x+dirx[i];
				int ny = temp.y+diry[i];
				//如果找到出口，进行回溯并打印
				if(nx == n-1 && ny == m-1) {
					flag[nx][ny] = flag[temp.x][temp.y]+1;
					huisu(flag);
					end = true;
					break;
				}
				//判断是否可以向该方向移动
				if(check(nx,ny,flag,map)) {
					flag[nx][ny] = flag[temp.x][temp.y]+1;
					testNode node = new testNode(nx,ny);
					queue.add(node);
				}
			}
			if(end) {
				break;
			}
		}
	}
	//用来判断该点是否满足条件
	public static boolean check(int x,int y,int[][] flag,int[][] map) {
		if(0 <= x && x < n && 0 <= y && y < m) {
			if(flag[x][y] == 0 && map[x][y] != 1) {
				return true;
			}
		}
		return false;
		
	}
	//用来回溯查找
	public static void huisu(int[][] flag) {
		//输入地图
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				System.out.print(flag[i][j]+" ");
			}
			System.out.println();
		}
		//开始回溯
			//定义栈空间存储坐标
			Stack<Map<Integer,Integer>> stack = new Stack();
			//定义起点
			int temp = flag[n-1][m-1]-1;
			for(int i = n-1,j = m-1;;) {
					if(temp == 0) {
						Map<Integer,Integer> node = new HashMap();
						node.put(0,0);
						stack.push(node);
						break;
					}
					if(j >= 0 && flag[i][j-1] == temp) {
						Map<Integer,Integer> node = new HashMap();
						node.put(i,j-1);
						stack.push(node);
						temp--;
						j--;
						continue;
					}
					if(i >= 0 && flag[i-1][j] == temp) {
						Map<Integer,Integer> node = new HashMap();
						node.put(i-1,j);
						stack.push(node);
						temp--;
						i--;
						continue;
					}
			}
			//遍历栈空间
			while(!stack.isEmpty()) {
				Map<Integer,Integer> map = stack.pop();
				System.out.println(map);
			}
	}
}
class testNode{
	int x;
	int y;
	public testNode(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
